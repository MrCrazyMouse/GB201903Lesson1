package gbjavacore.lesson4;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {

    public MainWindow() throws HeadlessException{
        setTitle("Application");
        setBounds(200,200,500,500);
        setDefaultCloseOperation(WindowConstants. EXIT_ON_CLOSE );
        setVisible(true);
    }
}
