import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ContainerPanel extends JPanel implements ActionListener {

    private class SizeListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            shapeHeight = Integer.valueOf(controlPanel.getSizeInputBox().getText());
            System.out.println(controlPanel.getSizeInputBox().getText());
        }
    }

    private class ColorListener implements ListSelectionListener {
        @Override
        public void valueChanged(ListSelectionEvent e) {
            if(controlPanel.getColorList().getSelectedValue() == "niebieski"){
                selectedColor = Color.blue;
            } else if(controlPanel.getColorList().getSelectedValue() == "czerwony") {
                selectedColor = Color.red;
            } else if(controlPanel.getColorList().getSelectedValue() == "zielony") {
                selectedColor = Color.green;
            } else if(controlPanel.getColorList().getSelectedValue() == "żółty") {
                selectedColor = Color.yellow;
            } else if(controlPanel.getColorList().getSelectedValue() == "czarny") {
                selectedColor = Color.black;
            }

        }
    }

    private ControlPanel controlPanel;
    private DrawingPanel drawingPanel;
    private int shapeHeight = 50;
    private static Color[] colors = {Color.blue, Color.red, Color.green, Color.yellow, Color.black};
    private Color selectedColor = Color.black;

    public ContainerPanel() {
        setLayout(new BorderLayout());
        drawingPanel = new DrawingPanel();
        controlPanel = new ControlPanel();
        SizeListener sizeListener = new SizeListener();
        ColorListener colorListener = new ColorListener();
        controlPanel.getColorList().addListSelectionListener(colorListener);
        controlPanel.getSizeInputBox().addActionListener(sizeListener);
        drawingPanel.setBorder(BorderFactory.createLineBorder(Color.black));
        controlPanel.setBorder(BorderFactory.createLineBorder(Color.black));
        controlPanel.getCircleButton().addActionListener(this);
        controlPanel.getRectangleButton().addActionListener(this);
        controlPanel.getSquareButton().addActionListener(this);
        controlPanel.getTriangleButton().addActionListener(this);
        add(drawingPanel, BorderLayout.CENTER);
        add(controlPanel, BorderLayout.SOUTH);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(selectedColor);
        Graphics gr = drawingPanel.getGraphics();
        gr.clearRect(0, 0, 400, 800);
        gr.setColor(selectedColor);
        if (e.getSource() == controlPanel.getCircleButton()) {
            gr.drawOval(55, 55, shapeHeight, shapeHeight);
        } else if (e.getSource() == controlPanel.getRectangleButton()) {
            gr.drawRect(34, 43, shapeHeight*3, shapeHeight);
        } else if (e.getSource() == controlPanel.getSquareButton()) {
            gr.drawRect(66, 66, shapeHeight, shapeHeight);
        } else if (e.getSource() == controlPanel.getTriangleButton()) {
            int xPoly[] = {10, 160, 400};
            int yPoly[] = {0, 200, 50};
            Polygon poly = new Polygon(xPoly, yPoly, xPoly.length);
            gr.drawPolygon(poly);
        }

    }
}
