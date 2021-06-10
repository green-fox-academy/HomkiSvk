import javax.swing.*;
import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlay {
    public static void drawImage(Graphics graphics) {

        Graphics2D g2 = (Graphics2D) graphics;
        g2.setStroke(new BasicStroke(1));  //u can set line thickness here

        // set the count for number of lines u want
        // set offset parameter to offset from sides

        int count = 25;
        int size =  HEIGHT -20;

        lowerLeftLines(count, size, 10, HEIGHT-10, graphics);
        upperRightLines(count, size, WIDTH-10, 10, graphics);
    }

    public static void lowerLeftLines (int count, int size, int startingPointX, int startingPointY, Graphics graphics){
        int spacing = size / count;
        int verticalY = startingPointY - size + spacing;            //Y-axis point of the line - starting point
        int inlineX = startingPointX +spacing;                      //X-axis point of the line - starting point

        for (int i = 0; i < count; i++) {
            graphics.drawLine(inlineX, startingPointY , startingPointX , verticalY);
            inlineX += spacing;
            verticalY += spacing;
        }
    }
    public static void upperRightLines (int count, int size, int startingPointX, int startingPointY, Graphics graphics){
        int spacing = size / count;
        int verticalY =  startingPointY + size -spacing;            //Y-axis point of the line - starting point
        int inlineX = startingPointX -spacing;                      //X-axis point of the line - starting point

        for (int i = 0; i < count; i++) {
            graphics.drawLine(inlineX, startingPointY, startingPointX, verticalY);
            inlineX -= spacing;
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