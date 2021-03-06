import javax.swing.*;

import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ColoredBox {
    public static void drawImage(Graphics graphics) {
        // Draw a box that has different colored lines on each edge
        Graphics2D g2 = (Graphics2D) graphics;
        g2.setStroke(new BasicStroke(2));

        rainbowColors(graphics);
        graphics.drawLine(100, 100, 200, 100);

        rainbowColors(graphics);
        graphics.drawLine(200, 100, 200, 200);

        rainbowColors(graphics);
        graphics.drawLine(200, 200, 100, 200);

        rainbowColors(graphics);
        graphics.drawLine(100, 200, 100, 100);

    }
    public static void rainbowColors (Graphics graphics){
        Random random =new Random();
        Color rainbow = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
        graphics.setColor(rainbow);
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