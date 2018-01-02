import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControlPanel extends JPanel {
    private JPanel colorAndSizePanel, shapePanel, shapeButtonPanel;
    private JLabel colorLabel, sizeLabel, shapeLabel;
    private JButton triangleButton, squareButton, circleButton, rectangleButton;
    private JTextField sizeInputBox;
    private JList colorList;
    private static String[] colorNames = {"niebieski", "czerwony", "zielony", "żółty", "czarny"};
    public ControlPanel() {
        setLayout(new BorderLayout());
        colorAndSizePanel = new JPanel();
        shapePanel = new JPanel();
        colorAndSizePanel.setLayout(new GridLayout(2,2));
        shapePanel.setLayout(new BorderLayout());
        shapeLabel = new JLabel("Kształt", SwingConstants.CENTER);

        shapeButtonPanel = new JPanel();
        shapeButtonPanel.setLayout(new GridLayout(1,4));

        triangleButton = new JButton("Trójkąt");
        squareButton = new JButton("Kwadrat");
        circleButton = new JButton("Okrąg");
        rectangleButton = new JButton("Prostokąt");
        shapeButtonPanel.add(triangleButton);
        shapeButtonPanel.add(squareButton);
        shapeButtonPanel.add(circleButton);
        shapeButtonPanel.add(rectangleButton);
        shapePanel.add(shapeLabel, BorderLayout.NORTH);
        shapePanel.add(shapeButtonPanel, BorderLayout.CENTER);

        add(shapePanel, BorderLayout.EAST);

        colorLabel = new JLabel("Kolor", SwingConstants.CENTER);
        sizeLabel = new JLabel("Rozmiar", SwingConstants.CENTER);
        colorList = new JList(colorNames);
        colorList.setVisibleRowCount(5);
        colorList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        sizeInputBox = new JTextField("50");
        shapePanel.setBorder(BorderFactory.createLineBorder(Color.black));
        shapeButtonPanel.setBorder(BorderFactory.createLineBorder(Color.black));
        colorAndSizePanel.setBorder(BorderFactory.createLineBorder(Color.black));
        colorAndSizePanel.add(colorLabel);
        colorAndSizePanel.add(sizeLabel);
        colorAndSizePanel.add(colorList);
        colorAndSizePanel.add(sizeInputBox);
        add(colorAndSizePanel, BorderLayout.CENTER);
        System.out.println("Drawing panel z Control panel klasy: ");
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

    public JButton getTriangleButton() {
        return triangleButton;
    }

    public void setTriangleButton(JButton triangleButton) {
        this.triangleButton = triangleButton;
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

    public JTextField getSizeInputBox() {
        return sizeInputBox;
    }

    public void setSizeInputBox(JTextField sizeInputBox) {
        this.sizeInputBox = sizeInputBox;
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
