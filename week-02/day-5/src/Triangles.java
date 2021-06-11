import javax.swing.*;
import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangles {
    public static void drawImage(Graphics graphics) {
        Graphics2D g2 = (Graphics2D) graphics;
        g2.setStroke(new BasicStroke(2));              // set the drawing thickness

        int count = 45;                // only this parameter needs to change to modify number of triangles in a row
        int size = WIDTH / count;
        int offset = WIDTH % count;
        int positionX = offset/2;                           // centering the big one
        int positionY = HEIGHT - 50;                        // separation from the bottom
        double height = (size * (Math.sqrt(3)) / 2);

        for (int rows = count; rows > 0; rows--) {
            int inlineX = positionX;
            for (int inlineCount = rows ; inlineCount > 0; inlineCount--) {
                rainbowColors(graphics);
                drawTriangle(inlineX, positionY, size, height, graphics);
                inlineX += size;
            }
            positionX += size / 2;
            positionY -= height;
        }
    }
    private static void drawTriangle(int posX, int posY, int size, double height, Graphics graphics) {
        int[] xpoints = {posX, posX + size, posX + size / 2};
        int[] ypoints = {posY, posY, posY - ((int) height)};
        graphics.drawPolygon(xpoints, ypoints, xpoints.length);
    }
    public static void rainbowColors (Graphics graphics){
        Random random =new Random();
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