import javax.swing.*;
import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SuperHexagon {
    public static void drawImage(Graphics graphics) {
        Graphics2D g2 = (Graphics2D) graphics;
        g2.setStroke(new BasicStroke(2));              // set the drawing thickness

        int count = 4;                // only this parameter needs to change to modify number of hexagons
        int size = (int) ((WIDTH - 100) / (count * 1.5));
        double height = (size * (Math.sqrt(3)) / 2);
        int startingX = WIDTH / 2;
        int startingY = (int) height;

        for (int rows = 0; rows < count; rows++) {
            int posY = startingY;
            for (int inlineCount = (count * 2) - 1; inlineCount > rows; inlineCount--) {
                rainbowColors(graphics);
                drawHexagon(startingX, posY, size, height, graphics);
                posY += height;
            }
            startingX -= 1.5 * size / 2;
            startingY += (int) height / 2;
        }
        startingY = (int) height;
        startingX = WIDTH/2;
        for (int rows = 0; rows < count; rows++) {
            int posY = startingY;
            if (rows != 0) {
                for (int inlineCount = (count * 2) - 1; inlineCount > rows; inlineCount--) {
                    rainbowColors(graphics);
                    drawHexagon(startingX, posY, size, height, graphics);
                    posY += height;
                }
            }
            startingX += 1.5 * size / 2;
            startingY += (int) height / 2;
        }
    }

    private static void drawHexagon(int posX, int posY, int size, double height, Graphics graphics) {
        int[] xpoints = {posX + size / 2, posX + size / 4, posX - size / 4, posX - size / 2, posX - size / 4, posX + size / 4};
        int[] ypoints = {posY, posY - (int) height / 2, posY - (int) height / 2, posY, posY + (int) height / 2, posY + (int) height / 2};
        graphics.drawPolygon(xpoints, ypoints, xpoints.length);
    }

    public static void rainbowColors(Graphics graphics) {
        Random random = new Random();
        Color rainbow = new Color(random.nextInt(220), random.nextInt(220), random.nextInt(220));
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