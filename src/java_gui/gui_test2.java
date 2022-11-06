package java_gui;

import javax.swing.*;
import java.awt.*;

public class gui_test2 extends JFrame {
    private Container c;

    gui_test2(){
        this.c = getContentPane();
        c.setLayout(new FlowLayout(FlowLayout.LEFT, 30,100));


        JLabel jl = new JLabel();
        c.addMouseListener(new mouse());


        setTitle("마우스");
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
