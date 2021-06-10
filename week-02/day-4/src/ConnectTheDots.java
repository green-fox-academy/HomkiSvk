import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ConnectTheDots {
    public static void drawImage(Graphics graphics) {
        // Create a function that takes 2 parameters:
        // an array of {x, y} points and graphics
        // and connects them with green lines.
        // Connect these to get a box: {{10, 10}, {290,  10}, {290, 290}, {10, 290}}
        // Connect these: {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70},
        // {120, 100}, {85, 130}, {50, 100}}
        int[][] pointsA =  {{10, 10}, {290,  10}, {290, 290}, {10, 290}};
        int[][] pointsB = {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70}, {120, 100}, {85, 130}, {50, 100}};

            pointToPoint(pointsA, graphics);
            pointToPoint(pointsB, graphics);
    }

    private static void pointToPoint(int[][] points, Graphics graphics) {
        graphics.setColor(Color.GREEN);
        for (int i = 0; i < points.length; i++) {
            if (!(i==points.length-1)){
                int xA = points[i][0];
                int yA = points[i][1];
                int xB = points[i+1][0];
                int yB = points[i+1][1];
                graphics.drawLine(xA, yA, xB, yB);
            } else {
                int xA = points[i][0];
                int yA = points[i][1];
                int xB = points[0][0];
                int yB = points[0][1];
                graphics.drawLine(xA, yA, xB, yB);
            }
        }
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