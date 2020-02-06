/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg82019.queue;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author DS-Demabildo
 */
public class Queue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        queueclass sss = new queueclass(6);
        int watodo = 0, numpicked = 0, check = 0;

        while (watodo != 4) {
            if (sss.full() == 6) {
                watodo = Integer.parseInt(JOptionPane.showInputDialog(null, "--Queue Activity--\n\nFull Queue!! \n[1]Push \n[2]Pop \n[3]Display \n[4]Stop"));
            } else if (sss.empty() != 1) {
                watodo = Integer.parseInt(JOptionPane.showInputDialog(null, "--Queue Activity--\n\nEmpty Queue!! \n[1]Push \n[2]Pop \n[3]Display \n[4]Stop"));
                sss.h = 0;
                sss.t = -1;
            } else {
                watodo = Integer.parseInt(JOptionPane.showInputDialog(null, "--Queue Activity--\n\n[1]Push \n[2]Pop \n[3]Display \n[4]Stop"));
            }

            switch (watodo) {
                case 1:
                    if (sss.full() == 6) {
                        JOptionPane.showMessageDialog(null, "Full Queue!! Cant push");
                    } else {
                        numpicked = Integer.parseInt(JOptionPane.showInputDialog(null, "Pick a number"));
                        sss.push(numpicked);
                        sss.display();
                    }
                    break;
                case 2:
                    sss.pop();
                    sss.display();
                    break;
                case 3:
                    sss.display();
                    System.out.println(" heads @ " + sss.h + " tails @ " + sss.t);

                    break;
                default:
                    break;
            }
        }
    }

}
