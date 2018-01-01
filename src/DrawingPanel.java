import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DrawingPanel extends JPanel{
    private int x, y;
    private ControlPanel cp;
    public DrawingPanel() {
    }

    @Override
    protected void paintComponent(Graphics g) {
        //x = getSize().width;
       // y = getSize().height;
        super.paintComponent(g);

        /*Graphics2D g2 = (Graphics2D) g;
        g2.drawOval(200, 150, 100, 100);
        g2.fillOval(225, 175, 50, 50);
        int xPoly[] = {150,250,325,375,450,275,100};
        int yPoly[] = {150,100,125,225,250,375,300};
        Polygon poly = new Polygon(xPoly, yPoly, xPoly.length);
        g.drawPolygon(poly);
        */


    }
}
