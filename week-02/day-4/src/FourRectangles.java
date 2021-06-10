import javax.swing.*;

import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRectangles {

    public static void drawImage(Graphics graphics){
        // Draw four different size and color rectangles
        // Avoid code duplication!

        Graphics2D g2 = (Graphics2D) graphics;
        g2.setStroke(new BasicStroke(2));

        for (int i = 0; i < 4; i++) {
            Random random = new Random();
            int a = random.nextInt(WIDTH-150);
            int b = 150+random.nextInt(HEIGHT-150);

            ColoredBox.rainbowColors(graphics);
            randomSizeTriangle(a,b, graphics);
        }
    }

    private static void randomSizeTriangle(int a, int b, Graphics graphics) {
        Random randSize = new Random();
        int size = 50 + randSize.nextInt(5)*20;

        int [] xpoints = {a, a+size, a+size/2};
        int [] ypoints = {b, b, b-size};
        graphics.drawPolygon(xpoints, ypoints, xpoints.length);
    }


    // Don't touch the code below
    static int WIDTH = 640;
    static int HEIGHT = 640;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            drawImage(graphics);
        }
    }
}