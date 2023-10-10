import java.awt.*;
import javax.swing.*;

public class Activity {

    public static void main(String[] args) 
    {
        JFrame frame = new JFrame ("BorderLayout Demo");
        JButton btn1 = new JButton("Button A");
        JButton btn2 = new JButton("Button B");
        JButton btn3 = new JButton("Button C");
        JButton btn4 = new JButton("Button D");
        JButton btn5 = new JButton("Button E");
        JButton btn6 = new JButton("Button F");
        JButton btn7 = new JButton("Button 3(LINE_START)");
        
        JPanel pa1 = new JPanel();
        pa1.setLayout(new java.awt.BorderLayout());
        pa1.setPreferredSize(new Dimension(500,250));
        pa1.add(btn7, java.awt.BorderLayout.LINE_START);
        JPanel pa2 = new JPanel (new java.awt.GridLayout(2,3,0,0));
        pa2.setPreferredSize(new Dimension(250,200));
        pa2.add(btn1);
        pa2.add(btn2);
        pa2.add(btn3);
        pa2.add(btn4);
        pa2.add(btn5);
        pa2.add(btn6);
        
        JPanel primary = new JPanel();
        primary.add(pa1);
        primary.add(pa2);
        
        frame.setDefaultCloseOperation(3);
        frame.setSize(800, 300);
        frame.getContentPane().add(primary);
        frame.setVisible(true);
    }
}