//Creating a button
import javax.swing.*;
import java.awt.*;
public class JButtonSample{
public static void main(String[] args)
{
JFrame f = new JFrame();
JButton btn1 = new JButton("Click me");
f.setLayout(new java.awt.FlowLayout());
//f.add(btn1);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
f.setSize(200,100);
f.setVisible(true);
}
}