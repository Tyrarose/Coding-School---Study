//hakdog di nagwowork import awt
//import java.awt.
import javax.swing.*;

public class BorderLayout {

    public static void main(String[] args) {
        JFrame frame = new JFrame ("BorderLayout Demo");
        JButton btn1 = new JButton("Button 1 (page start)");
        JButton btn2 = new JButton("Button 2 (center)");
        JButton btn3 = new JButton("Button 3 (line start)");
        JButton btn4 = new JButton("Button 4 (page end)");
        JButton btn5 = new JButton("Button 5 (line end)");
        
        JPanel panel = new JPanel();
        panel.setLayout(new java.awt.BorderLayout());
        panel.add(btn1, java.awt.BorderLayout.NORTH);
        panel.add(btn2, java.awt.BorderLayout.WEST);
        panel.add(btn3, java.awt.BorderLayout.CENTER);
        panel.add(btn4, java.awt.BorderLayout.EAST);
        panel.add(btn5, java.awt.BorderLayout.SOUTH);
        
        frame.setDefaultCloseOperation(3);
        frame.setSize(500, 500);
        frame.getContentPane().add(panel);
        frame.setVisible(true);
    }
    
}