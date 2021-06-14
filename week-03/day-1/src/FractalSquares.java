import javax.swing.*;
import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;


public class FractalSquares {
    public static void drawImage(Graphics graphics) {
        Graphics2D g2 = (Graphics2D) graphics;
        g2.setStroke(new BasicStroke(1));               // set the drawing thickness

        int count = 5;                // only this parameter needs to change to modify number of hexagons
        double size = WIDTH -20;
        double startingX = 10;
        double startingY = 10;

        drawSquareRec(count, startingX, startingY, size, graphics);

    }

    private static void drawSquareRec(int n, double startingX, double startingY, double size, Graphics graphics) {
        if (n == 0) return;

        drawSquare(startingX, startingY, size, graphics);

        drawSquareRec(n - 1, startingX + size/3, startingY , size / 3, graphics);
        drawSquareRec(n - 1, startingX , startingY +size/3, size / 3, graphics);
        drawSquareRec(n - 1, startingX + (size*2/3), startingY + size/3, size / 3, graphics);
        drawSquareRec(n - 1, startingX + size/3, startingY + (size*2/3), size / 3, graphics);
    }

    private static void drawSquare(double x, double y, double size, Graphics graphics) {
        graphics.setColor(Color.BLACK);

        graphics.drawRect((int)x, (int)y, (int)size, (int)size);
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
            this.setBackground(Color.LIGHT_GRAY);
            drawImage(graphics);
        }
    }
}