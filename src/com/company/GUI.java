package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame {
    int a;
    int b;
    String str;
    JFrame jFrame=new JFrame(){};
    private JButton button=new JButton("Milan");
    private JButton button1=new JButton("Madrid");
    private JLabel score=new JLabel("Result:"+a+"X"+b);
    private JLabel last=new JLabel("LastScore:"+str);
    private JLabel Winner=new JLabel("Winner is"+str);






    public GUI()
    {
        super("Football");
        this.setBounds(500,500,500,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container=this.getContentPane();
        container.setLayout(new GridLayout(3,2,2,2));

container.add(score);
container.add(last);
container.add(button);
container.add(button1);
container.add(Winner);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a+=1;
                str="Milan";
                score.setText("Result:"+a+"X"+b);
                last.setText("LastScore:"+str);
                if(a>b)
                Winner.setText("Winner is"+str);
            }
        });

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                b+=1;
                str="Madrid";
                score.setText("Result:"+a+"X"+b);
                last.setText("LastScore:"+str);
                if(a<b)
                Winner.setText("Winner is"+str);
            }
        });



    }

}
