import javax.swing.*;

import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class StarryNight {
    public static void drawImage(Graphics graphics) {
        // Draw the night sky:
        //  - The background should be black
        //  - The stars can be small squares
        //  - The stars should have random positions on the canvas
        //  - The stars should have random color (some shade of grey) 80-240

        Random random = new Random();
        int stars = 100+random.nextInt(300);

        for (int i = 0; i < stars; i++) {
            int a = 5+random.nextInt(WIDTH-10);
            int b = 5+random.nextInt(HEIGHT-10);
            randStarColor(graphics);
            createStar(a,b, graphics);
        }
    }

    private static void randStarColor(Graphics graphics) {
        Random random =new Random();
        int starColor = 80 +random.nextInt(160);
        Color rainbow = new Color(starColor, starColor, starColor);
        graphics.setColor(rainbow);
    }

    public static void createStar(int x, int y, Graphics graphics){
        graphics.drawLine(x-5, y-5, x+5, y+5);
        graphics.drawLine(x-5, y, x+5, y);
        graphics.drawLine(x+5, y+5, x-5, y-5);
        graphics.drawLine(x, y-5, x, y+5);
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
            Color bg = new Color(60,70,100);
            this.setBackground(bg);
            drawImage(graphics);
        }
    }
}