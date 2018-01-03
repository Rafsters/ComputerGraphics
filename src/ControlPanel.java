import javax.swing.*;
import java.awt.*;

public class ControlPanel extends JPanel {
    private JPanel colorAndSizePanel, shapePanel, shapeButtonPanel;
    private JLabel colorLabel, sizeLabel, shapeLabel;
    private JButton squareButton, circleButton, rectangleButton;
    private JSlider sizeSlider;
    private JList colorList;
    private static String[] colorNames = {"niebieski", "czerwony", "zielony", "żółty", "biały"};


    public ControlPanel() {
        setLayout(new BorderLayout());
        colorAndSizePanel = new JPanel();
        shapePanel = new JPanel();
        colorAndSizePanel.setLayout(new GridLayout(2, 2));
        shapePanel.setLayout(new BorderLayout());
        shapeLabel = new JLabel("Kształt", SwingConstants.CENTER);
        shapeLabel.setFont(new Font("Serif", Font.BOLD, 24));

        shapeButtonPanel = new JPanel();
        shapeButtonPanel.setLayout(new GridLayout(1, 3));

        squareButton = new JButton("Kwadrat");
        squareButton.setBorder(BorderFactory.createLineBorder(Color.black));
        circleButton = new JButton("Okrąg");
        circleButton.setBorder(BorderFactory.createLineBorder(Color.black));
        rectangleButton = new JButton("Prostokąt");
        rectangleButton.setBorder(BorderFactory.createLineBorder(Color.black));

        shapeButtonPanel.add(squareButton);
        shapeButtonPanel.add(circleButton);
        shapeButtonPanel.add(rectangleButton);
        shapePanel.add(shapeLabel, BorderLayout.NORTH);
        shapePanel.add(shapeButtonPanel, BorderLayout.CENTER);

        add(shapePanel, BorderLayout.EAST);

        colorLabel = new JLabel("Kolor", SwingConstants.CENTER);
        colorLabel.setFont(new Font("Serif", Font.BOLD, 24));
        colorLabel.setBorder(BorderFactory.createLineBorder(Color.black));
        sizeLabel = new JLabel("Rozmiar", SwingConstants.CENTER);
        sizeLabel.setFont(new Font("Serif", Font.BOLD, 24));
        sizeLabel.setBorder(BorderFactory.createLineBorder(Color.black));
        colorList = new JList(colorNames);
        DefaultListCellRenderer renderer = (DefaultListCellRenderer) colorList.getCellRenderer();
        renderer.setHorizontalAlignment(JLabel.CENTER);
        colorList.setBorder(BorderFactory.createLineBorder(Color.black));

        colorList.setVisibleRowCount(5);
        colorList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        sizeSlider = new JSlider(50, 150, 50);
        sizeSlider.setBorder(BorderFactory.createLineBorder(Color.black));

        sizeSlider.setBounds(50, 50, 150, 50);
        sizeSlider.setMajorTickSpacing(25);
        sizeSlider.setMinorTickSpacing(5);
        sizeSlider.setPaintTicks(true);
        sizeSlider.setPaintLabels(true);
        shapePanel.setBorder(BorderFactory.createLineBorder(Color.black));
        colorAndSizePanel.setBorder(BorderFactory.createLineBorder(Color.black));
        colorAndSizePanel.add(colorLabel);
        colorAndSizePanel.add(sizeLabel);
        colorAndSizePanel.add(colorList);
        colorAndSizePanel.add(sizeSlider);
        colorAndSizePanel.setBorder(BorderFactory.createLineBorder(Color.black));
        shapePanel.setBorder(BorderFactory.createLineBorder(Color.black));
        add(colorAndSizePanel, BorderLayout.CENTER);
    }

    public JSlider getSizeSlider() {
        return sizeSlider;
    }

    public void setSizeSlider(JSlider sizeSlider) {
        this.sizeSlider = sizeSlider;
    }

    public JButton getSquareButton() {
        return squareButton;
    }

    public JButton getCircleButton() {
        return circleButton;
    }

    public JButton getRectangleButton() {
        return rectangleButton;
    }

    public JList getColorList() {
        return colorList;
    }


}
