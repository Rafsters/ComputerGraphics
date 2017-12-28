import javax.swing.*;
import java.awt.*;

public class ControlPanel extends JPanel {
    private JLabel colorLabel, sizeLabel, shapeLabel;
    private JButton triangle, square, circle, rectangle;
    private JTextField sizeInputBox;
    private JList colorList;
    private static String[] colorNames = {"niebieski", "czerwony", "zielony", "żółty", "czarny"};
    private static Color[] colors = {Color.blue, Color.red, Color.green, Color.yellow, Color.black};
    public ControlPanel() {
        setLayout(new BorderLayout());

    }
}
