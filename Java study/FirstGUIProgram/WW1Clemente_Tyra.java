import java.awt.*;
import javax.swing.*;

public class WW1Clemente_Tyra {
    
    //Color very_light_red = new Color(255,102,102);
    
    public  WW1Clemente_Tyra() {
        JFrame jframe = new JFrame("My favorite book opening sentence");
        JPanel panel = new JPanel();
        panel.setBackground(new Color (255,102,102));
        jframe.setSize(500,500);
        //jframe.getContentPane().setBackground(very_light_red);
        jframe.setDefaultCloseOperation(3);
        JLabel quote = new JLabel("<html>\"I was sitting in a taxi, "
                + "<br>wondering if I had overdressed for the evening, <br/>"
                + "when I looked out the window and saw Mom rooting through a Dumpster.\"<br/>"
                + "Glass Castle by Jeannette Walls<html/>");
        //quote.setHorizontalAlignment(SwingConstants.CENTER);
        
        quote.setFont(new Font("Consolas",Font.BOLD,12));
        quote.setForeground(Color.white);
        
       panel.add(quote);
        jframe.add(panel);
        jframe.add(panel, java.awt.FlowLayout.CENTER);
         jframe.setVisible(true);
    }
    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                new WW1Clemente_Tyra();
            }
        });
    }
}