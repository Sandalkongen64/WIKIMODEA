import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class GUI extends JFrame implements ActionListener, MouseListener{



    private void ændrfjern() {
        JFrame change = new JFrame();
        change.setExtendedState(MAXIMIZED_BOTH);
        change.setDefaultCloseOperation(EXIT_ON_CLOSE);
        change.setVisible(true);
        JPanel changepanel = new JPanel();
        change.add(changepanel);

        JTextField titelField = new JTextField();

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}