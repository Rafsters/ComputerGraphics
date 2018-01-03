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
        super.paintComponent(g);
    }
}
