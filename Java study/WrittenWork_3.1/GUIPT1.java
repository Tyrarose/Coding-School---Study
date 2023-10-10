import java.awt.*;
import javax.swing.*;

//Clemente, Tyra
//Carganilla, Joel

public class GUIPT1 {
    
    JFrame f;
    JPanel rootP;
    
    public GUIPT1(){
        f = new JFrame("GUIPT1 (Clemente & Carganilla)");
        rootP = new JPanel(new FlowLayout());
        rootP.setBackground(Color.BLACK);
        f.add(rootP);
        
        //////////RGB PANELS WITH NUMBER
        JPanel red0 = new JPanel(new FlowLayout());
        red0.setBackground(Color.RED);
        red0.setPreferredSize(new Dimension(70,70));
        JLabel zero = new JLabel("0");
        red0.add(zero);
        
        JPanel green1 = new JPanel(new FlowLayout());
        green1.setBackground(Color.GREEN);
        green1.setPreferredSize(new Dimension(70,70));
        JLabel one = new JLabel("1");
        green1.add(one);
        
        JPanel blue2 = new JPanel(new FlowLayout());
        blue2.setBackground(Color.BLUE);
        blue2.setPreferredSize(new Dimension(70,70));
        JLabel two = new JLabel("2");
        blue2.add(two);
        
        JPanel red3 = new JPanel(new FlowLayout());
        red3.setBackground(Color.RED);
        red3.setPreferredSize(new Dimension(70,70));
        JLabel three = new JLabel("3");
        red3.add(three);
        
        JPanel green4 = new JPanel(new java.awt.FlowLayout());
        green4.setBackground(Color.GREEN);
        green4.setPreferredSize(new Dimension(70,70));
        JLabel four = new JLabel("4");
        green4.add(four);
        
        JPanel blue5 = new JPanel(new FlowLayout());
        blue5.setBackground(Color.BLUE);
        blue5.setPreferredSize(new Dimension(70,70));
        JLabel five = new JLabel("5");
        blue5.add(five);
        
        JPanel red6 = new JPanel(new FlowLayout());
        red6.setBackground(Color.RED);
        red6.setPreferredSize(new Dimension(70,70));
        JLabel six = new JLabel("6");
        red6.add(six);
        
        JPanel green7 = new JPanel(new FlowLayout());
        green7.setBackground(Color.GREEN);
        green7.setPreferredSize(new Dimension(70,70));
        JLabel seven = new JLabel("7");
        green7.add(seven);
        
        JPanel blue8 = new JPanel(new FlowLayout());
        blue8.setBackground(Color.BLUE);
        blue8.setPreferredSize(new Dimension(70,70));
        JLabel eight = new JLabel("8");
        blue8.add(eight);
        
        ////////////////////CYAN PANEL
        JPanel cyanB = new JPanel(new FlowLayout());
        cyanB.setBackground(Color.CYAN);
        cyanB.setPreferredSize(new Dimension(250,250));
        
        JLabel left = new JLabel("← Left");
        left.setFont(new Font("Courier New", Font.BOLD, 50));
        cyanB.add(left, BorderLayout.PAGE_START);
        
        cyanB.add(red0, BorderLayout.EAST);
        cyanB.add(green1, BorderLayout.CENTER);
        cyanB.add(blue2, BorderLayout.WEST);
        
        JLabel fname = new JLabel("Tyra & Joel");
        fname.setFont(new Font("Courier New", Font.BOLD, 20));
        cyanB.add(fname, BorderLayout.PAGE_END);
        
        
        ////////////////////YELLOW PANEL
        JPanel yellowB = new JPanel(new FlowLayout());
        yellowB.setBackground(Color.YELLOW);
        yellowB.setPreferredSize(new Dimension(250,250));
        
        JLabel mid = new JLabel("Middle");
        mid.setFont(new Font("Arial", Font.BOLD, 55));
        yellowB.add(mid);
        
        yellowB.add(red3, BorderLayout.WEST);
        yellowB.add(green4, BorderLayout.CENTER);
        yellowB.add(blue5, BorderLayout.EAST);
        
        JLabel mname = new JLabel("Paasa & Torres");
        mname.setFont(new Font("Arial", Font.BOLD, 20));
        yellowB.add(mname, BorderLayout.PAGE_END);
        
        
        ////////////////////PINK PANEL
        JPanel pinkB = new JPanel(new FlowLayout());
        pinkB.setBackground(Color.PINK);
        pinkB.setPreferredSize(new Dimension(250,250));
        
        JLabel right = new JLabel("Right →");
        right.setFont(new Font("Times New Roman", Font.BOLD, 55));
        pinkB.add(right);
        
        pinkB.add(red6, BorderLayout.WEST);
        pinkB.add(green7, BorderLayout.CENTER);
        pinkB.add(blue8, BorderLayout.EAST);
        
        JLabel lname = new JLabel("Clemente & Carganilla");
        lname.setFont(new Font("Times New Roman", Font.BOLD, 18));
        pinkB.add(lname, BorderLayout.PAGE_END);
       
        
        
        rootP.add(cyanB, FlowLayout.LEFT);
        rootP.add(yellowB, FlowLayout.CENTER);
        rootP.add(pinkB, FlowLayout.RIGHT);
        
        f.setDefaultCloseOperation(3);
        f.setSize(800,300);
        f.setVisible(true);
        
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                new GUIPT1();
            }
        });
    }
}