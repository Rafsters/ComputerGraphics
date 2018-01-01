import javax.swing.*;
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

    private ControlPanel controlPanel;
    private DrawingPanel drawingPanel;
    private int shapeHeight;

    public ContainerPanel() {
        setLayout(new BorderLayout());
        drawingPanel = new DrawingPanel();
        controlPanel = new ControlPanel();
        SizeListener sizeListener = new SizeListener();
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

        Graphics gr = drawingPanel.getGraphics();
        gr.clearRect(0, 0, 400, shapeHeight);
        if (e.getSource() == controlPanel.getCircleButton()) {
            gr.drawOval(55, 55, shapeHeight, shapeHeight);
        } else if (e.getSource() == controlPanel.getRectangleButton()) {
            gr.drawRect(34,43,200, shapeHeight);
        } else if (e.getSource() == controlPanel.getSquareButton()) {
            gr.drawRect(66,66,122, shapeHeight);
        } else if (e.getSource() == controlPanel.getTriangleButton()) {
            int xPoly[] = {10,160,400};
            int yPoly[] = {0,200,50};
            Polygon poly = new Polygon(xPoly, yPoly, xPoly.length);
            gr.drawPolygon(poly);
        }

    }
}
