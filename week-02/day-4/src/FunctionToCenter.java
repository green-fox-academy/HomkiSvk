
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FunctionToCenter {
    public static void drawImage(Graphics graphics) {
        // Create a function that takes 3 parameters and draws a single line
        // Parameters: the x and y coordinates of the line's starting point and the graphics
        // The function shall draw a line from that point to the center of the canvas
        // Fill the canvas with lines from the edges (every 20 px) to the center
        Graphics2D g2 = (Graphics2D) graphics;
        g2.setStroke(new BasicStroke(2));

        for (int i = 0; i <= WIDTH; i+=20) {
            for (int j = 0; j <= HEIGHT; j+=20) {
                if (i==0 || i== WIDTH || j ==0 || j == HEIGHT){
                    ColoredBox.rainbowColors(graphics);
                    toTheCenter(i,j, graphics);
                }
            }
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