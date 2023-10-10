/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tyra C.
 */
import java.awt.*;
import javax.swing.*;

public class AbsoluteLayout {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame f = new JFrame ("AbsoluteLayout Demo");
        f.setLayout(null);
        
        JButton btn1 = new JButton("Click me");
        btn1.setBounds(20,20,150,80);
        
        f.add(btn1);
        
        f.setDefaultCloseOperation(3);
        f.setSize(500,350);
        f.setVisible(true);
    }
    
}
