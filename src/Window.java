import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {
   private ContainerPanel containerPanel;
    public Window() throws HeadlessException {
        super("Poproszę 5.0");
        setSize(800,600);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        containerPanel = new ContainerPanel();
        add(containerPanel, BorderLayout.CENTER);
    }

}
