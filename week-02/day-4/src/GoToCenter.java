
import javax.swing.*;

import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class GoToCenter {
    public static void drawImage(Graphics graphics) {
        // Create a function that takes 3 parameters and draws a single line
        // Parameters: the x and y coordinates of the line's starting point and the graphics
        // The function shall draw a line from that point to the center of the canvas
        // Draw at least 3 lines with that function using a loop
        Graphics2D g2 = (Graphics2D) graphics;
        g2.setStroke(new BasicStroke(2));
        Random random = new Random();

        for (int i = 0; i < 20; i++) {
            int a = random.nextInt(640);
            int b = random.nextInt(640);

            Color rainbow = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
            graphics.setColor(rainbow);

            toTheCenter(a,b, graphics);
        }
    }
    private static void toTheCenter (int x, int y, Graphics graphics){
        graphics.drawLine(x,y,WIDTH/2, HEIGHT/2);
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