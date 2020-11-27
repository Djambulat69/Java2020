package ru.capchik.java2020.Praktika12;

import com.google.gson.Gson;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Document html;
        try {
            html = Jsoup.connect("https://www.moscowmap.ru/metro.html#lines").maxBodySize(0).get();
            Elements spansLines = html.select("span[class^=js-metro-line t-metrostation-list-header t-icon-met]");

            List<Line> lines = new ArrayList<Line>();
            Map<String, ArrayList<String>> stations = new HashMap<>();
            for (int i = 0; i < 17; i++) {
                lines.add(new Line());
                lines.get(i).name = spansLines.get(i).text();
                lines.get(i).number = spansLines.get(i).attr("data-line");
                Elements spansStations = html.select(String.format("div[data-line=%s] span[class=name]",
                        lines.get(i).number));
                ArrayList<String> stationNames = new ArrayList<>();
                for (int j = 0; j < spansStations.size(); j++) {
                    stationNames.add(spansStations.get(j).text());
                }
                stations.put(lines.get(i).number, stationNames);
            }
            MetroToWrite metro = new MetroToWrite();
            metro.stations = stations;
            metro.lines = lines;
            Gson json = new Gson();
            String sJson = json.toJson(metro);
            try {
                Files.write(Paths.get("gson.json"), Collections.singleton(sJson));
            }
            catch(Exception ex){
                ex.printStackTrace();
            }
            Gson gsonNew = new Gson();
            MetroToRead metro2 = gsonNew.fromJson(parseFile("gson.json"), MetroToRead.class);
            System.out.println(metro2);
        } catch (IOException ex) {
            ex.printStackTrace();
        }


    }

    public static String parseFile(String path) {
        StringBuilder builder = new StringBuilder();

        try {
            List<String> files = Files.readAllLines(Paths.get(path));

            files.forEach(file -> builder.append(file).append("\n"));
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return builder.toString();
    }
}

class Line {
    public String number;
    public String name;

    @Override
    public String toString() {
        return "Line{" +
                "number='" + number + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}

class MetroToWrite {
    public Map<String, ArrayList<String>> stations;
    public List<Line> lines;
}
class MetroToRead {
    public Map<String, ArrayList<String>> stations;
    public List<Line> lines;

    @Override
    public String toString() {
        return "MetroToRead{" +
                "stations=" + stations +
                ", lines=" + lines +
                '}';
    }
}