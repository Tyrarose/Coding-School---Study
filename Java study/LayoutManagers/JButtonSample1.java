import javax.swing.*;
import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class JButtonSample1 {
    public static void main(String[] args){
        JFrame f = new JFrame("JButton Sample");
        f.setLayout(new java.awt.FlowLayout());
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setBackground(Color.yellow);
        
	JButton btn = new JButton("Click me");
        // JButton btn = new JButton(new ImageIcon("C:\\Users\\gannc\\Documents\\download.png"));
        btn.setPreferredSize(new Dimension(230,230));
        btn.setFont(new Font("Chiller",Font.ITALIC,28));
        btn.setBackground(Color.red);
        
        //actionEventListener
        btn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(null,"Hello World!");
                
            }
        
        });
        
	f.add(btn);
        f.setSize(500,500);
	f.setVisible(true);
    }
}


