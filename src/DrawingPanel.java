import javax.swing.*;
import java.awt.*;

public class DrawingPanel extends JPanel {
    private int x, y;
    public DrawingPanel() {
    }

    @Override
    protected void paintComponent(Graphics g) {
        x = getSize().width;
        y = getSize().height;
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        g2.drawRect(300, 200, 200, 100);

        g2.drawOval(50, 50, 200, 200);
        g2.fillOval(100, 100, 100, 100);
        //g2.drawOval(100, 100, 100, 100);
        g2.draw

        g2.drawOval(550, 50, 200, 200);
        g2.fillOval(600, 100, 100, 100);
        //g2.drawOval();
        /*
        g2.setColor( Color.yellow );
        for ( int i = 0; i <= 30; ++i ) {
            g.drawLine( x / 4, y, i * y / 30, 0 );
        }
        g2.setColor( Color.green );
        for ( int i = 0; i <= 30; ++i ) {
            g.drawLine(3 * x / 4, y, i * x / 30, 0);
        }
        */

    }
}
