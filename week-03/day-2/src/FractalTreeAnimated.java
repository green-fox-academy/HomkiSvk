import javax.swing.*;
import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FractalTreeAnimated extends Canvas {

    private Image buffer = createImage(WIDTH, HEIGHT);

    public static void drawImage(Graphics graphics) {

        int count = 5;                // only this parameter needs to change to modify number of hexagons
        int size = 15;
        double angle = -90;
        int startingX = WIDTH / 2;
        int startingY = HEIGHT - 100;

        graphics.drawImage(buffer, 0, 0, null);
        Color treeColor = new Color(255, 217, 0);
        graphics.setColor(treeColor);
        drawTree(count, startingX, startingY, angle, size, graphics);
    }

    private static void drawTree(int count, int startingX, int startingY, double angle, int size, Graphics graphics) {
        if (count == 0) return;


        int endingX = startingX + (int) (Math.cos(Math.toRadians(angle)) * count * size);
        int endingY = startingY + (int) (Math.sin(Math.toRadians(angle)) * count * size);

        Graphics2D g2 = (Graphics2D) graphics;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setStroke(new BasicStroke(count * 0.5f));

        graphics.drawLine(startingX, startingY, endingX, endingY);

        inlineDraw(count, endingX, endingY, angle, size, graphics);
    }

    private static void inlineDraw(int count, int endingX, int endingY, double angle, int size, Graphics graphics) {
        if (count == 0)
            return;

        int newInlineX = endingX + (int) (Math.cos(Math.toRadians(angle)) * count * size);
        int newInlineY = endingY + (int) (Math.sin(Math.toRadians(angle)) * count * size);

        Graphics2D g2 = (Graphics2D) graphics;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setStroke(new BasicStroke(count * 0.5f));

        graphics.drawLine(endingX, endingY, newInlineX, newInlineY);

        inlineDraw(count - 1, newInlineX, newInlineY, angle, size, graphics);

        drawTree(count - 1, endingX, endingY, angle - 25, size, graphics);
        drawTree(count - 1, endingX, endingY, angle + 25, size, graphics);
    }

    public static void rainbowColors(Graphics graphics) {
        Random random = new Random();
        Color rainbow = new Color(random.nextInt(220), random.nextInt(220), random.nextInt(220));
        graphics.setColor(rainbow);
    }

    static int WIDTH = 1080;
    static int HEIGHT = 920;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
        Color bg = new Color(0, 49, 63);
        jFrame.setBackground(bg);
    }

    static class ImagePanel extends JPanel {

        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            drawImage(graphics);
        }
    }
} 