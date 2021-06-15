import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class FractalTreeAnimated extends Canvas {

    public static void rainbowColors(Graphics graphics) {
        Random random = new Random();
        Color rainbow = new Color(random.nextInt(220), random.nextInt(220), random.nextInt(220));
        graphics.setColor(rainbow);
    }

    private JFrame frame;
    static int WIDTH = 1080;
    static int HEIGHT = 920;
    private Image buffer = createImage(WIDTH, HEIGHT);

    public FractalTreeAnimated() {
        frame = new JFrame("Fractal Tree");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(WIDTH, HEIGHT);
        frame.setLocationRelativeTo(null);
        frame.setResizable(true);
        frame.add(this);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        FractalTreeAnimated ft = new FractalTreeAnimated();
        ft.setVisible(true);
        Color bg = new Color(0, 49, 63);
        ft.setBackground(bg);
    }

    @Override
    public void paint(Graphics graphics) {
        int count = 9;                // only this parameter needs to change to modify number of hexagons
        int size = 13;
        double angle = -90;
        int startingX = WIDTH / 2;
        int startingY = HEIGHT - 100;

        Color treeColor = new Color(255, 217, 0);
        graphics.setColor(treeColor);
        graphics.drawImage(buffer, 0, 0, null);

        drawTree(count, startingX, startingY, angle, size, graphics);
    }

    private void drawTree(int count, int startingX, int startingY, double angle, int size, Graphics graphics) {
        if (count == 0) return;

        int endingX = startingX + (int) (Math.cos(Math.toRadians(angle)) * count *  size);
        int endingY = startingY + (int) (Math.sin(Math.toRadians(angle)) * count *  size);

        Graphics2D g2 = (Graphics2D) graphics;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setStroke(new BasicStroke(count * 0.5f));

        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        graphics.drawLine(startingX, startingY, endingX, endingY);

        //inlineDraw(count, endingX, endingY, angle, size, graphics);

        drawTree(count - 1, endingX, endingY, angle , size, graphics);
        drawTree(count - 1, endingX, endingY, angle - 28, size, graphics);
        drawTree(count - 1, endingX, endingY, angle + 28, size, graphics);
    }

    private void inlineDraw(int count, int endingX, int endingY, double angle, int size, Graphics graphics) {
        if (count == 0) return;

        int newInlineX = endingX + (int) (Math.cos(Math.toRadians(angle)) * count *  size);
        int newInlineY = endingY + (int) (Math.sin(Math.toRadians(angle)) * count *  size);

        Graphics2D g2 = (Graphics2D) graphics;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setStroke(new BasicStroke(count * 0.5f));

        graphics.drawLine(endingX, endingY, newInlineX, newInlineY);

        inlineDraw(count - 1, newInlineX, newInlineY, angle, size, graphics);

        drawTree(count - 1, endingX, endingY, angle - 28, size, graphics);
        drawTree(count - 1, endingX, endingY, angle + 28, size, graphics);
    }

} 