import javax.swing.*;
import java.awt.*;

public class ControlPanel extends JPanel {
    private JPanel colorAndSizePanel, shapePanel, shapeButtonPanel;
    private JLabel colorLabel, sizeLabel, shapeLabel;
    private JButton triangle, square, circle, rectangle;
    private JTextField sizeInputBox;
    private JList colorList;
    private static String[] colorNames = {"niebieski", "czerwony", "zielony", "żółty", "czarny"};
    private static Color[] colors = {Color.blue, Color.red, Color.green, Color.yellow, Color.black};
    public ControlPanel() {
        setLayout(new BorderLayout());
        colorAndSizePanel = new JPanel();
        shapePanel = new JPanel();
        colorAndSizePanel.setLayout(new GridLayout(2,2));
        shapePanel.setLayout(new BorderLayout());
        shapeLabel = new JLabel("Kształt", SwingConstants.CENTER);

        shapeButtonPanel = new JPanel();
        shapeButtonPanel.setLayout(new GridLayout(1,4));

        triangle = new JButton("Trójkąt");
        square = new JButton("Kwadrat");
        circle = new JButton("Okrąg");
        rectangle = new JButton("Prostokąt");

        shapeButtonPanel.add(triangle);
        shapeButtonPanel.add(square);
        shapeButtonPanel.add(circle);
        shapeButtonPanel.add(rectangle);
        shapePanel.add(shapeLabel, BorderLayout.NORTH);
        shapePanel.add(shapeButtonPanel, BorderLayout.CENTER);

        add(shapePanel, BorderLayout.EAST);

        colorLabel = new JLabel("Kolor", SwingConstants.CENTER);
        sizeLabel = new JLabel("Rozmiar", SwingConstants.CENTER);
        colorList = new JList(colorNames);
        colorList.setVisibleRowCount(5);
        colorList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        sizeInputBox = new JTextField("");
        shapePanel.setBorder(BorderFactory.createLineBorder(Color.black));
        shapeButtonPanel.setBorder(BorderFactory.createLineBorder(Color.black));
        colorAndSizePanel.setBorder(BorderFactory.createLineBorder(Color.black));
        colorAndSizePanel.add(colorLabel);
        colorAndSizePanel.add(sizeLabel);
        colorAndSizePanel.add(colorList);
        colorAndSizePanel.add(sizeInputBox);
        add(colorAndSizePanel, BorderLayout.CENTER);
    }
}
