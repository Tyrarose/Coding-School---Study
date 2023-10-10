import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//Clemente, Tyra
//Carganilla, Joel

public class Personal_Antivirus_01  implements ActionListener{
    JFrame f;
    JPanel mainP, header, leftMenu, center, bar;
    JButton scan , piracy, Vchest, logs, settings, StartScan;
    JProgressBar progBar;
    
    public Personal_Antivirus_01(){
        f = new JFrame("GUIPT1 (Clemente & Carganilla)");
        mainP = new JPanel(new BorderLayout());
        
        header();
        f.add(mainP);
        f.setDefaultCloseOperation(3);
        f.setSize(500,200);
        f.setLocationRelativeTo(null);
        f.setResizable(false);
        f.setVisible(true);
}
    public void header(){
        header = new JPanel(new FlowLayout());
        header.setBackground(new Color(127, 127, 255));
        
        JLabel antiVi = new JLabel("Personal Antivirus 1.0");
        antiVi.setFont(new Font("Arial",Font.BOLD,30));
        header.add(antiVi);
        
        JLabel creds = new JLabel("Copyright 2021 @ Clemente, Tyra P. & Carganilla, Joel T.");
        creds.setFont(new Font("Arial",Font.BOLD,10));
        
        mainP.add(header, BorderLayout.PAGE_START);
        mainP.add(creds, BorderLayout.PAGE_END);
        leftMenu();
        center();
    }
    public void leftMenu(){
        leftMenu = new JPanel(new GridLayout(6,1,0,5));
        
        scan = new JButton("Scan");
        piracy = new JButton("Piracy");
        Vchest = new JButton("Virus Chest");
        logs = new JButton("Logs");
        settings = new JButton("Settings");
        
        JButton btn = new JButton("Click me");
        btn.setPreferredSize(new Dimension(10,10));
        
        leftMenu.add(scan);
        leftMenu.add(piracy);
        leftMenu.add(Vchest);
        leftMenu.add(logs);
        leftMenu.add(settings);
        
        mainP.add(btn, BorderLayout.CENTER);
        mainP.add(leftMenu, BorderLayout.LINE_START);
    }
    
    public void center(){
        center = new JPanel();
        center.setLayout(null);
        bar = new JPanel();
        
        StartScan = new JButton("Start Scan");
        StartScan.setFont(new Font("Impact", Font.PLAIN, 15));
        StartScan.setPreferredSize(new Dimension(140,50));
        StartScan.addActionListener(this);
        
        progBar = new JProgressBar(0,100);
        bar.setBounds(120,40,140, 50);
        progBar.setBounds(50,10,280, 30);
        progBar.setValue(0);
        
        bar.add(StartScan);
        center.add(bar);
        center.add(progBar);
        
        mainP.add(center);
;    }
    
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                new Personal_Antivirus_01();
            }
        });
    }
    public void actionPerformed(ActionEvent ae) {

        int i = 0;
        if (ae.getSource() == StartScan) {
            progBar.setVisible(true);
                try {
                    while (i <= 100) {

                        Thread.sleep(50);
                        progBar.paintImmediately(0, 0, 200, 200);
                        progBar.setValue(i);
                        i++;
                    }
                } catch (Exception e) {
                    System.out.print(e);
                }
                progBar.setValue(0);
            
        }

    }
    }