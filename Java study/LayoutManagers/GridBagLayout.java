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
public class GridBagLayout {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame ("GridBagLayout Demo");
        JButton btn1 = new JButton("Button 1");
        JButton btn2 = new JButton("Button 2");
        JButton btn3 = new JButton("Button 3");
        JButton btn4 = new JButton("Button 4");
        JButton btn5 = new JButton("Button 5");
        
        JPanel panel = new JPanel (new java.awt.GridBagLayout());
        GridBagConstraints cst = new GridBagConstraints();
        
        cst.fill = GridBagConstraints.HORIZONTAL;
        cst.gridx = 0;
        cst.gridy = 0;
        panel.add(btn1,cst);
        
        cst.fill = GridBagConstraints.HORIZONTAL;
        cst.gridx = 1;
        cst.gridy = 0;
        panel.add(btn2,cst);
        
        cst.fill = GridBagConstraints.HORIZONTAL;
        cst.gridx = 3;
        cst.gridy = 0;
        panel.add(btn3,cst);
        
        cst.fill = GridBagConstraints.HORIZONTAL;
        cst.gridwidth = 4;
        cst.gridheight = 2;
        cst.gridx = 0;
        cst.gridy = 1;
        panel.add(btn4,cst);
        
        frame.setDefaultCloseOperation(3);
        frame.setSize(500, 500);
        frame.getContentPane().add(panel);
        frame.setVisible(true);
    }
    
}
