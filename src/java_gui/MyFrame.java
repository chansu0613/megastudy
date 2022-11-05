package java_gui;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyFrame extends JFrame {
    MyFrame(){
        setTitle("엄준식");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container cp = getContentPane();
        cp.setBackground(Color.CYAN);
        cp.setLayout(new BorderLayout());

        JButton jb1 = new JButton("중");
        jb1.addActionListener(new MyListener("center"));
        JButton jb2 = new JButton("동");
        jb2.addActionListener(new MyListener("east"));
        JButton jb3 = new JButton("서");
        jb3.addActionListener(new MyListener("west"));
        JButton jb4 = new JButton("남");
        jb4.addActionListener(new MyListener("south"));
        JButton jb5 = new JButton("북");
        jb5.addActionListener(new MyListener("north"));

        cp.add(jb1,BorderLayout.CENTER);
        cp.add(jb2,BorderLayout.EAST);
        cp.add(jb3,BorderLayout.WEST);
        cp.add(jb4,BorderLayout.SOUTH);
        cp.add(jb5,BorderLayout.NORTH);

//        JButton umm1 = new JButton("엄");
//        umm1.addActionListener(new MyListener());
//        JButton umm2 = new JButton("엄");
//        umm2.addActionListener(new MyListener());
//        JButton umm3 = new JButton("엄");
//        umm3.addActionListener(new MyListener());
//
//        cp.add(umm1);
//        cp.add(umm2);
//        cp.add(umm3);

        setSize(500,500);
        setVisible(true);
    }
}