package new_Ramazan;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Cerceve extends ButtonNeu{


    public static void main(String[] args) {


        frame.setSize(200,200);
        frame.getContentPane().add(buton);
        frame.add(panel);
        panel.add(buton);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        panel.add(menu);
        panel.add(check);
        panel.getFont();

        buton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Merhabalar sana eyyy yuce sahsiyet");
            }
        });

        String str="src/new_Ramazan/Screenshot 2021-11-16 200028.jpg";
        ActionEvent event=new ActionEvent(str,123,"resim");

       event.getActionCommand();

        event.paramString();


    }
}
