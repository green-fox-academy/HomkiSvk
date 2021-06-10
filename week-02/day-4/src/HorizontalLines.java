import javax.swing.*;

import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class HorizontalLines {
    public static void drawImage(Graphics graphics) {
        // Create a function that takes 3 parameters and draws a single line
        // Parameters: the x and y coordinates of the line's starting point and the graphics
        // The function shall draw a 50 long horizontal line from that point
        // Draw at least 3 lines with that function using a loop
        Graphics2D g2 = (Graphics2D) graphics;
        g2.setStroke(new BasicStroke(2));

        for (int i = 0; i < 1000; i++) {
            Random random = new Random();
            int a = random.nextInt(WIDTH-50);
            int b = random.nextInt(HEIGHT);

            ColoredBox.rainbowColors(graphics);
            goHorizontal50(a,b, graphics);
        }
    }

    private static void goHorizontal50(int a, int b, Graphics graphics) {
        graphics.drawLine(a,b,a+50, b);
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
