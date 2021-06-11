import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlay {
    public static void drawImage(Graphics graphics) {

        Graphics2D g2 = (Graphics2D) graphics;
        g2.setStroke(new BasicStroke(2));  //u can set line thickness here

        // set the count for number of lines u want

        /*int count = 25;
        int size =  HEIGHT -20;

        lowerLeftLines(count, size, 10, HEIGHT-10, graphics);
        upperRightLines(count, size, WIDTH-10, 10, graphics);*/

        //draw in grid

        int count = 20;                         //set number of lines in the drawing
        int gridSize = 2;                       //set grid size use increments of 4
        int size = WIDTH/gridSize;

        for (int x = size/2; x < WIDTH; x+=size) {
            for (int y = size/2; y < HEIGHT; y+=size) {
                lowerLeftLines(count, size, x-size/2, y+size/2,graphics);
                upperRightLines(count, size, x+size/2, y-size/2, graphics);
            }
        }
    }

    public static void lowerLeftLines (int count, int size, int startingPointX, int startingPointY, Graphics graphics){
        graphics.setColor(Color.GREEN);
        int spacing = size / count;
        int verticalY = startingPointY - size + spacing;            //Y-axis point of the line - starting point
        int inlineX = startingPointX +spacing;                      //X-axis point of the line - starting point

        for (int i = 0; i < count-1; i++) {
            graphics.drawLine(inlineX, startingPointY , startingPointX , verticalY);
            inlineX += spacing;
            verticalY += spacing;
        }
    }
    public static void upperRightLines (int count, int size, int startingPointX, int startingPointY, Graphics graphics){
        graphics.setColor(Color.PINK);
        int spacing = size / count;
        int verticalY =  startingPointY + size -spacing;            //Y-axis point of the line - starting point
        int inlineX = startingPointX -spacing;                      //X-axis point of the line - starting point

        for (int i = 0; i < count-1; i++) {
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