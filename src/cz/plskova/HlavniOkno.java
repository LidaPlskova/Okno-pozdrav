package cz.plskova;

import java.awt.event.*;
import javax.swing.*;

public class HlavniOkno extends JFrame {

        private JLabel labJmeno;
        private JTextField txtVstup;
        private JButton btnPozdrav;
        private JLabel labVystup;

        public HlavniOkno (){

               this.setSize(350,400);
               this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
               this.setLayout(null);

                labJmeno = new JLabel();
               labJmeno.setSize(100,20);
               labJmeno.setLocation(20, 20);
               labJmeno.setText("Zadej jméno");

                txtVstup =  new JTextField();
               txtVstup.setSize(150, 20);
               txtVstup.setLocation(100, 20);

                btnPozdrav = new JButton();
               btnPozdrav.setSize(100,20);
               btnPozdrav.setLocation(50, 60);
               btnPozdrav.setText("Pozdrav");
               btnPozdrav.addMouseListener(new MouseAdapter() {
                       @Override
                       public void mouseClicked(MouseEvent e) {
                               poKliknutiNaTlacitko(e);
                       }
               });

                labVystup = new JLabel();
               labVystup.setSize(300, 40);
               labVystup.setLocation(20, 80);


               //pridame do okna objekty, aby se objevily

               this.add(labJmeno);
               this.add(txtVstup);
               this.add(btnPozdrav);
               this.add(labVystup);

               //aby se vše vykreslilo
               this.setVisible(true);

           }
        private void poKliknutiNaTlacitko (MouseEvent e){
             labVystup.setText("Jé, "+ txtVstup.getText()+"! Ahoj!");
        }
       }

