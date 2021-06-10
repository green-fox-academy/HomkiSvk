import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class EnvelopeStar {
    public static void drawImage(Graphics graphics) {

        Graphics2D g2 = (Graphics2D) graphics;
        g2.setStroke(new BasicStroke(1));  //u can set line thickness here

        // set the count for number of lines u want
        // set offset parameter to offset from sides

        int count = 20;
        int size = (HEIGHT / 2)-10;
        int startingPointX = HEIGHT / 2;
        int startingPointY = WIDTH / 2;

        lowerLeftLines(count, size, startingPointX, startingPointY, graphics);
        upperRightLines(count, size, startingPointX, startingPointY, graphics);
        lowerRightLines(count, size, startingPointX, startingPointY, graphics);
        upperLeftLines(count, size, startingPointX, startingPointY, graphics);
    }

    public static void lowerLeftLines(int count, int size, int startingPointX, int startingPointY, Graphics graphics) {
        int spacing = size / count;
        int verticalY = startingPointY - size ;               //Y-axis point of the line - starting point
        int inlineX = startingPointX;                                  //X-axis point of the line - starting point

        for (int i = 0; i < count; i++) {
            graphics.drawLine(inlineX, startingPointY, startingPointX, verticalY);
            inlineX += spacing;
            verticalY += spacing;
        }
    }

    public static void upperRightLines(int count, int size, int startingPointX, int startingPointY, Graphics graphics) {
        int spacing = size / count;
        int verticalY = startingPointY + size ;      //Y-axis point of the line - starting point
        int inlineX = startingPointX;                                  //X-axis point of the line - starting point

        for (int i = 0; i < count; i++) {
            graphics.drawLine(inlineX, startingPointY, startingPointX, verticalY);
            inlineX -= spacing;
            verticalY -= spacing;
        }
    }

    public static void lowerRightLines(int count, int size, int startingPointX, int startingPointY, Graphics graphics) {
        int spacing = size / count;
        int verticalY = startingPointY - size ;            //Y-axis point of the line - starting point
        int inlineX = startingPointX - spacing;                              //X-axis point of the line - starting point

        for (int i = 0; i < count; i++) {
            graphics.drawLine(inlineX, startingPointY, startingPointX, verticalY);
            inlineX -= spacing;
            verticalY += spacing;
        }
    }

    public static void upperLeftLines(int count, int size, int startingPointX, int startingPointY, Graphics graphics) {
        int spacing = size / count;
        int verticalY = startingPointY + size ;           //Y-axis point of the line - starting point
        int inlineX = startingPointX + spacing;                             //X-axis point of the line - starting point

        for (int i = 0; i < count; i++) {
            graphics.drawLine(inlineX, startingPointY, startingPointX, verticalY);
            inlineX += spacing;
            verticalY -= spacing;
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