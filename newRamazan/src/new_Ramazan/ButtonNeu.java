package new_Ramazan;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonNeu extends Container{
     ButtonNeu(){

    }
    ButtonNeu (JButton buton){
         buton.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 System.out.println("Selam olsun sana yuce sahis ");
             }
         });

    }
}
