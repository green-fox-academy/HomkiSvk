import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class EnvelopeStar {
    public static void drawImage(Graphics graphics) {

        Graphics2D g2 = (Graphics2D) graphics;
        g2.setStroke(new BasicStroke(2));  //u can set line thickness here

        // set the lines for number of lines u want
        int lines = 20;                                 //how many lines u want in each quadrant
        graphics.setColor(Color.ORANGE);

        //for little fun
        /*int gridSize = 2;
        int sizeInGrid = WIDTH/gridSize;

        for (int startingX = sizeInGrid/2; startingX < WIDTH; startingX+=sizeInGrid) {
            for (int startingY = sizeInGrid/2; startingY < HEIGHT; startingY+=sizeInGrid) {
                drawStar(lines, sizeInGrid, startingX, startingY, graphics);
            }
        }*/

        //for exercise
        // 1st parameter is number of lines u want to put into each quadrant
        // 2nd parameter is size of the star
        // 3rd nad 4th are coordinates x and y of the middle point in star

        drawStar(lines, WIDTH, HEIGHT/2, WIDTH/2, graphics);

    }

    private static void drawStar(int linesCount, int size, int startingPointX, int startingPointY, Graphics graphics) {
        lowerLeftLines(linesCount, size/2, startingPointX, startingPointY, graphics);
        upperRightLines(linesCount, size/2, startingPointX, startingPointY, graphics);
        lowerRightLines(linesCount, size/2, startingPointX, startingPointY, graphics);
        upperLeftLines(linesCount, size/2, startingPointX, startingPointY, graphics);
    }

    public static void lowerLeftLines(int linesCount, int size, int startingPointX, int startingPointY, Graphics graphics) {
        int spacing = size / linesCount;
        int verticalY = startingPointY - size ;                         //Y-axis point of the line - starting point
        int inlineX = startingPointX;                                  //X-axis point of the line - starting point

        for (int i = 0; i < linesCount; i++) {
            graphics.drawLine(inlineX, startingPointY, startingPointX, verticalY);
            inlineX += spacing;
            verticalY += spacing;
        }
    }

    public static void upperRightLines(int linesCount, int size, int startingPointX, int startingPointY, Graphics graphics) {
        int spacing = size / linesCount;
        int verticalY = startingPointY + size ;                         //Y-axis point of the line - starting point
        int inlineX = startingPointX;                                  //X-axis point of the line - starting point

        for (int i = 0; i < linesCount; i++) {
            graphics.drawLine(inlineX, startingPointY, startingPointX, verticalY);
            inlineX -= spacing;
            verticalY -= spacing;
        }
    }

    public static void lowerRightLines(int linesCount, int size, int startingPointX, int startingPointY, Graphics graphics) {
        int spacing = size / linesCount;
        int verticalY = startingPointY - size ;                             //Y-axis point of the line - starting point
        int inlineX = startingPointX ;                              //X-axis point of the line - starting point

        for (int i = 0; i < linesCount; i++) {
            graphics.drawLine(inlineX, startingPointY, startingPointX, verticalY);
            inlineX -= spacing;
            verticalY += spacing;
        }
    }

    public static void upperLeftLines(int linesCount, int size, int startingPointX, int startingPointY, Graphics graphics) {
        int spacing = size / linesCount;
        int verticalY = startingPointY + size ;                             //Y-axis point of the line - starting point
        int inlineX = startingPointX ;                             //X-axis point of the line - starting point

        for (int i = 0; i < linesCount; i++) {
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