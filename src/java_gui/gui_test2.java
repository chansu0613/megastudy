package java_gui;

import javax.swing.*;
import java.awt.*;

public class gui_test2 extends JFrame {
    gui_test2(){
        setTitle("마우스");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        JLabel jl = new JLabel();
        c.addMouseListener(new mouse());

        setSize(500,500);
        setVisible(true);
    }
}
