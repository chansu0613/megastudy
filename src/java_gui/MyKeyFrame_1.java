package java_gui;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class MyKeyFrame_1 extends JFrame {
    JPanel panel = new JPanel();
    JLabel label = new JLabel("HELLO");

    MyKeyFrame_1(){
        setTitle("상하좌우 키 움직이기");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(panel);
        panel.setLayout(null);
        panel.addKeyListener(new MyKeyListener());

        //첫 생성시 라벨 위치
        label.setLocation(50,50);
        label.setSize(100,20);
        panel.add(label);

        setSize(200,200);
        setVisible(true);
        panel.requestFocus();
    }

    class MyKeyListener extends KeyAdapter{
        @Override
        public void keyPressed(KeyEvent e) {
            switch (e.getKeyCode()){
                case KeyEvent.VK_UP:
                    System.out.println(e.getKeyCode());
                    label.setLocation(label.getX(), label.getY()-10);break;
                case KeyEvent.VK_DOWN:
                    System.out.println(e.getKeyCode());
                    label.setLocation(label.getX(), label.getY()+10);break;
                case KeyEvent.VK_RIGHT:
                    System.out.println(e.getKeyCode());
                    label.setLocation(label.getX()+10, label.getY());break;
                case KeyEvent.VK_LEFT:
                    System.out.println(e.getKeyCode());
                    label.setLocation(label.getX()-10, label.getY());break;
            }
        }
    }
}