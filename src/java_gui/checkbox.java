package java_gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class checkbox extends JFrame {
    JLabel jl1 = new JLabel("사과 100원, 배 500원, 체리 20000원");
    JLabel jl2 = new JLabel("현재 ");
    JLabel jl3 = new JLabel("-원 ");
    JLabel jl4 = new JLabel("입니다.");

    JButton jb1 = new JButton("사과");
    JButton jb2 = new JButton("배");
    JButton jb3 = new JButton("체리");
    checkbox(){
        setTitle("과일 가격 프로그램");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container cp = getContentPane();
        cp.setLayout(new FlowLayout(FlowLayout.CENTER));


        cp.add(jl1);
        cp.add(jb1);
        cp.add(jb2);
        cp.add(jb3);
        cp.add(jl2);
        cp.add(jl3);
        cp.add(jl4);

        setSize(200,200);
        setVisible(true);
    }
    public class click implements ActionListener {
        int sum = 0;
        @Override
        public void actionPerformed(ActionEvent e) {
            if (jb1.getText().equals("사과")){
                sum += 100;
            } else if (jb2.getText().equals("배")){

            } else if (jb3.getText().equals("체리")){

            }
        }
    }
}
