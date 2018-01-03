import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
        DefaultListCellRenderer renderer =  (DefaultListCellRenderer)colorList.getCellRenderer();
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
        //shapeButtonPanel.setBorder(BorderFactory.createLineBorder(Color.black));
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

    public JPanel getColorAndSizePanel() {
        return colorAndSizePanel;
    }

    public void setColorAndSizePanel(JPanel colorAndSizePanel) {
        this.colorAndSizePanel = colorAndSizePanel;
    }

    public JPanel getShapePanel() {
        return shapePanel;
    }

    public void setShapePanel(JPanel shapePanel) {
        this.shapePanel = shapePanel;
    }

    public JPanel getShapeButtonPanel() {
        return shapeButtonPanel;
    }

    public void setShapeButtonPanel(JPanel shapeButtonPanel) {
        this.shapeButtonPanel = shapeButtonPanel;
    }


    public JLabel getColorLabel() {
        return colorLabel;
    }

    public void setColorLabel(JLabel colorLabel) {
        this.colorLabel = colorLabel;
    }

    public JLabel getSizeLabel() {
        return sizeLabel;
    }

    public void setSizeLabel(JLabel sizeLabel) {
        this.sizeLabel = sizeLabel;
    }

    public JLabel getShapeLabel() {
        return shapeLabel;
    }

    public void setShapeLabel(JLabel shapeLabel) {
        this.shapeLabel = shapeLabel;
    }

    public JButton getSquareButton() {
        return squareButton;
    }

    public void setSquareButton(JButton squareButton) {
        this.squareButton = squareButton;
    }

    public JButton getCircleButton() {
        return circleButton;
    }

    public void setCircleButton(JButton circleButton) {
        this.circleButton = circleButton;
    }

    public JButton getRectangleButton() {
        return rectangleButton;
    }

    public void setRectangleButton(JButton rectangleButton) {
        this.rectangleButton = rectangleButton;
    }

    public JList getColorList() {
        return colorList;
    }

    public void setColorList(JList colorList) {
        this.colorList = colorList;
    }

    public static String[] getColorNames() {
        return colorNames;
    }

    public static void setColorNames(String[] colorNames) {
        ControlPanel.colorNames = colorNames;
    }


}
