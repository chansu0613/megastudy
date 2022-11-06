package java_gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class MyKeyFrame extends JFrame {
    JPanel panal = new JPanel();
    JLabel jl = new JLabel("hello");

    MyKeyFrame(){
        setTitle("키보드");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setContentPane(panal);
        panal.setLayout(null);
        panal.addKeyListener(new MyKeyListener());

        //첫 생성시 라벨 위치
        jl.setLocation(50,50);
        jl.setSize(100,20);
        panal.add(jl);

        setSize(1000,1000);
        setVisible(true);
        panal.requestFocus();
    }
    class MyKeyListener extends KeyAdapter {
        public void KeyPressed(KeyEvent e){
            System.out.println(e.getKeyCode());
            int keycode = e.getKeyCode();

            if (keycode == KeyEvent.VK_UP){
                jl.setLocation(jl.getX(),jl.getY()-10);
            } else if (keycode == KeyEvent.VK_DOWN){
                jl.setLocation(jl.getX(),jl.getY()+10);
            } else if (keycode == KeyEvent.VK_LEFT){
                jl.setLocation(jl.getX()-10,jl.getY());
            } else if (keycode == KeyEvent.VK_RIGHT){
                jl.setLocation(jl.getX()+10,jl.getY());
            }
        }
    }
}
