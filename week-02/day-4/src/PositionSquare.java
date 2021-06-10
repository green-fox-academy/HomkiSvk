import javax.swing.*;

import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PositionSquare {

    public static void drawImage(Graphics graphics){
        // Create a function that takes 3 parameters and draws one square
        // Parameters: the x and y coordinates of the square's top left corner and the graphics
        // The function shall draw a 50x50 square from that point
        // Draw 3 squares with that function
        // Avoid code duplication!

        Graphics2D g2 = (Graphics2D) graphics;
        g2.setStroke(new BasicStroke(2));

        for (int i = 0; i < 3; i++) {
            Random random = new Random();
            int a = random.nextInt(WIDTH-50);
            int b = random.nextInt(HEIGHT-50);

            ColoredBox.rainbowColors(graphics);
            randomSquare(a,b, graphics);
        }
    }

    private static void randomSquare(int a, int b, Graphics graphics) {
        graphics.drawRect(a, b, 50,50);
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