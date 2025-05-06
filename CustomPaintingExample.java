import javax.swing.*;
import java.awt.*;

public class CustomPaintingExample extends JPanel {
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); // Always call this to ensure proper rendering
        
        // Cast Graphics object to Graphics2D for more advanced options
        Graphics2D g2d = (Graphics2D) g;
        
        // Set color for rectangle
        g2d.setColor(Color.RED);
        
        // Draw a rectangle
        g2d.fillRect(50, 50, 200, 100); // x, y, width, height
        
        // Set color for oval
        g2d.setColor(Color.BLUE);
        
        // Draw an oval
        g2d.fillOval(100, 150, 200, 100); // x, y, width, height
    }
    
    public static void main(String[] args) {
        JFrame frame = new JFrame("Custom Painting Example");
        CustomPaintingExample panel = new CustomPaintingExample();
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400); // Set the frame size
        frame.add(panel); // Add our custom panel to the frame
        frame.setVisible(true); // Show the frame
    }
}
