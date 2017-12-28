import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {
    private DrawingPanel drawingPanel;
    private ControlPanel controlPanel;
    //private JPanel windowPanel;
    public Window() throws HeadlessException {
        super("Grafika Komputerowa - Rafał Kwiecień");
        setSize(600,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        drawingPanel = new DrawingPanel();
        controlPanel = new ControlPanel();
        drawingPanel.setBorder(BorderFactory.createLineBorder(Color.black));
        controlPanel.setBorder(BorderFactory.createLineBorder(Color.red));
        add(drawingPanel, BorderLayout.NORTH);
        add(controlPanel, BorderLayout.SOUTH);
    }

}
