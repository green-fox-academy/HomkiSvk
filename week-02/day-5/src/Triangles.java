import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangles {
    public static void drawImage(Graphics graphics) {
        Graphics2D g2 = (Graphics2D) graphics;
        g2.setStroke(new BasicStroke(2));

        int count = 20;                // only this parameter needs to change to modify number of triangles in a row
        int size = WIDTH / count;
        int positionX = 0;
        int positionY = HEIGHT - 50;
        double height = (size * (Math.sqrt(3)) / 2);

        for (int j = count; j > 0; j--) {
            drawTriangle(positionX, positionY, size, height, graphics);
            int inlineX = positionX;
            for (int k = j - 1; k > 0; k--) {
                inlineX += size;
                drawTriangle(inlineX, positionY, size, height, graphics);
            }
            positionX += size / 2;
            positionY -= height;
        }
    }

    private static void drawTriangle(int a, int b, int size, double height, Graphics graphics) {
        int[] xpoints = {a, a + size, a + size / 2};
        int[] ypoints = {b, b, b - ((int) height)};
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