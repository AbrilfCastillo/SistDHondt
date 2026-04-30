package vista.componentes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BotonMenu extends JButton {

    private Color bgColor = new Color(132, 155, 191);      // normal fondo
    private Color textColor = new Color(228, 235, 247);    // normal texto

    private Color hoverbgColor = new Color(228, 231, 240); // hover fondo
    private Color hovertextColor = new Color(34, 53, 84);  // hover texto

    private boolean hover = false;

    public BotonMenu(String text) {
        super(text);

        setPreferredSize(new Dimension(200,40));
        setMaximumSize(new Dimension(200,40));
        setMinimumSize(new Dimension(200,40));

        setFocusPainted(false);
        setBorderPainted(false);
        setContentAreaFilled(false);
        setOpaque(false);

        setForeground(textColor); 

        setCursor(new Cursor(Cursor.HAND_CURSOR));
        setAlignmentX(Component.CENTER_ALIGNMENT);

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                hover = true;
                setForeground(hovertextColor); 
                repaint();
            }

            @Override
            public void mouseExited(MouseEvent e) {
                hover = false;
                setForeground(textColor);
                repaint();
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();

        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Fondo según estado
        g2.setColor(hover ? hoverbgColor : bgColor);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 20, 20);

        g2.dispose();

        super.paintComponent(g); 
    }
}