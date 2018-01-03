import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ContainerPanel extends JPanel implements ActionListener {

    private class SizeListener implements ChangeListener {
        @Override
        public void stateChanged(ChangeEvent e) {
            shapeSize = controlPanel.getSizeSlider().getValue();
        }
    }

    private class ColorListener implements ListSelectionListener {
        @Override
        public void valueChanged(ListSelectionEvent e) {
            if (controlPanel.getColorList().getSelectedValue() == "niebieski") {
                selectedColor = Color.blue;
            } else if (controlPanel.getColorList().getSelectedValue() == "czerwony") {
                selectedColor = Color.red;
            } else if (controlPanel.getColorList().getSelectedValue() == "zielony") {
                selectedColor = Color.green;
            } else if (controlPanel.getColorList().getSelectedValue() == "żółty") {
                selectedColor = Color.yellow;
            } else if (controlPanel.getColorList().getSelectedValue() == "biały") {
                selectedColor = Color.white;
            }

        }
    }

    private ControlPanel controlPanel;
    private DrawingPanel drawingPanel;
    private Color selectedColor = Color.green;
    private int shapeSize = 50;

    public ContainerPanel() {
        setLayout(new BorderLayout());
        drawingPanel = new DrawingPanel();
        controlPanel = new ControlPanel();
        ColorListener colorListener = new ColorListener();
        SizeListener sizeListener = new SizeListener();
        controlPanel.getColorList().addListSelectionListener(colorListener);
        controlPanel.getSizeSlider().addChangeListener(sizeListener);
        drawingPanel.setBorder(BorderFactory.createLineBorder(Color.black));
        controlPanel.setBorder(BorderFactory.createLineBorder(Color.black));
        controlPanel.getCircleButton().addActionListener(this);
        controlPanel.getRectangleButton().addActionListener(this);
        controlPanel.getSquareButton().addActionListener(this);
        add(drawingPanel, BorderLayout.CENTER);
        add(controlPanel, BorderLayout.SOUTH);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int randomXCoordinates = (int) (Math.random() * 600);
        int randomYCoordinates = (int) (Math.random() * 220);
        System.out.println("Kolor: " + selectedColor + " ,Random co-ordinate X: " + randomXCoordinates + " ,Random co-ordinate Y: " + randomYCoordinates);
        Graphics gr = drawingPanel.getGraphics();
        //gr.clearRect(0, 0, 800, 600);
        gr.setColor(selectedColor);
        if (e.getSource() == controlPanel.getCircleButton()) {
            gr.fillOval(randomXCoordinates, randomYCoordinates, shapeSize, shapeSize);
            gr.setColor(Color.black);
            gr.drawOval(randomXCoordinates, randomYCoordinates, shapeSize, shapeSize);
        } else if (e.getSource() == controlPanel.getRectangleButton()) {
            gr.fillRect(randomXCoordinates, randomYCoordinates, shapeSize * 3, shapeSize);
            gr.setColor(Color.black);
            gr.drawRect(randomXCoordinates, randomYCoordinates, shapeSize * 3, shapeSize);

        } else if (e.getSource() == controlPanel.getSquareButton()) {
            gr.fillRect(randomXCoordinates, randomYCoordinates, shapeSize, shapeSize);

            gr.setColor(Color.black);
            gr.drawRect(randomXCoordinates, randomYCoordinates, shapeSize, shapeSize);

        }

    }
}
