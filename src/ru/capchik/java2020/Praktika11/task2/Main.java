package ru.capchik.java2020.Praktika11.task2;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        Document doc = Jsoup.connect("https://www.mirea.ru").get();
        Elements images = doc.select("img");
        ArrayList<String> sources = new ArrayList<>();
        for (Element e:
             images) {
            String src = e.attr("abs:src");
            if (!src.isEmpty()) {
                URL img = new URL(src);
                BufferedImage image = ImageIO.read(img);
                String name = src.split("/")[src.split("/").length - 1];
                if (name.contains(".jpg")) {
                    ImageIO.write(image, "jpg", new File("src/ru/capchik/java2020/images/" + name));
                }
                if (name.contains(".png")) {
                    ImageIO.write(image, "png", new File("src/ru/capchik/java2020/images/" + name));
                }
            }
            System.out.println(e.attr("abs:src"));        }


    }
}
