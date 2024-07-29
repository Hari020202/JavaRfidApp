package Controllers;

import java.awt.*;
import javax.swing.*;

public class ImageBackgroundPanel extends JPanel {
    private Image backgroundImage;

    // Constructor to load the image
    public ImageBackgroundPanel(String fileName) {
        backgroundImage = new ImageIcon(fileName).getImage();
    }

    // Override the paintComponent method to draw the background image
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Draw the background image
        g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
    }
}
