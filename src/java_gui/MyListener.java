package java_gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyListener implements ActionListener {

    private String direction;

    MyListener(String dir){
        this.direction = dir;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton jb1 = (JButton) e.getSource();
        jb1.setText(direction);
    }
}
