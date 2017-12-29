import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {
    private DrawingPanel drawingPanel;
    private ControlPanel controlPanel;
    public Window() throws HeadlessException {
        super("Poproszę 5.0");
        setSize(800,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        drawingPanel = new DrawingPanel();
        controlPanel = new ControlPanel();
        drawingPanel.setBorder(BorderFactory.createLineBorder(Color.black));
        controlPanel.setBorder(BorderFactory.createLineBorder(Color.black));
        add(drawingPanel, BorderLayout.CENTER);
        add(controlPanel, BorderLayout.SOUTH);
    }

}
