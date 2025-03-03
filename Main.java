import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;



public class Main extends JFrame {
    public static void main(String[] args) {
        new TEST();
        JFrame frame = new JFrame();
        frame.setExtendedState(MAXIMIZED_BOTH);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setVisible(true);
        JPanel panel = new JPanel();
        JPanel søgepanel = new JPanel();
        frame.add(panel);
        frame.add(søgepanel);
        frame.setBackground(Color.BLACK);
        

        TextManager textManager = new TextManager();


    }
}