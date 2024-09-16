package main;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;

public class Main {
    public static void main(String[] args) {
        int width = 640;
        int height = 480;

        Random random = new Random();

        File image = new File("Image.png");                                                 // file image to store the image produce.
        BufferedImage buffer = new BufferedImage(width, height,BufferedImage.TYPE_INT_RGB);          // buffer to hold the pixel of the image.

        long start = System.nanoTime();

        for (int x = 0; x < width; x++) {
            for (int y = 0 ; y < height; y++) {
                buffer.setRGB(x, y,random.nextInt());
            }
        }

        try {
            ImageIO.write(buffer, "PNG", image);
        } catch (IOException e) {
            System.out.println("could not write image");
            System.exit(1);
        }

        long end = System.nanoTime();
        System.out.println("Long time: " + (end-start)/1000_000_000.0F);
    }
}