import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

//Clemente, Tyra
//Carganilla, Joel

public class GUIPT3 implements ActionListener{
    JFrame f,db;
    JPanel mainP, header,center, header2, center2;
    JLabel logL, unameL, pwordL,spc1,dbL;
    JButton logB;
    JTextField unameT;
    JPasswordField pwordPF;
    
    public GUIPT3(){
        f = new JFrame("GUIPT3");
        mainP = new JPanel(new BorderLayout());
        
        login();
        f.add(mainP);
        f.setDefaultCloseOperation(3);
        f.setSize(400,200);
        f.setLocationRelativeTo(null);
        f.setResizable(false);
        f.setVisible(true);
        
    }
    public void login (){
        header = new JPanel();
        header.setBackground(new Color(0, 100, 0));
        
        logL = new JLabel("Login");
        logL.setFont(new Font("Consolas",Font.BOLD,20));
        logL.setForeground(Color.YELLOW);
        header.add(logL);
        
        JPanel center = new JPanel(new GridBagLayout());
        center.setPreferredSize(new Dimension(250,250));
        GridBagConstraints cst = new GridBagConstraints();
        
        unameL = new JLabel("Username ");
        cst.fill = GridBagConstraints.HORIZONTAL;
        cst.gridx = 0;
        cst.gridy = 0;
        center.add(unameL,cst); 
        
        unameT = new JTextField();
        cst.fill = GridBagConstraints.HORIZONTAL;
        cst.gridwidth = 2;
        cst.gridx = 1;
        cst.gridy = 0;
        center.add(unameT,cst);
        
        spc1 = new JLabel(" ");
        cst.fill = GridBagConstraints.HORIZONTAL;
        cst.gridx = 0;
        cst.gridy = 2;
        center.add(spc1,cst);
        
        pwordL = new JLabel("Password ");
        cst.fill = GridBagConstraints.HORIZONTAL;
        cst.gridx = 0;
        cst.gridy = 3;
        center.add(pwordL,cst);
        
        pwordPF = new JPasswordField();
        pwordPF.setEchoChar('\u25CF');
        cst.fill = GridBagConstraints.HORIZONTAL;
        cst.gridwidth = 2;
        cst.gridx = 1;
        cst.gridy = 3;
        center.add(pwordPF,cst);
        
         spc1 = new JLabel(" ");
        cst.fill = GridBagConstraints.HORIZONTAL;
        cst.gridx = 0;
        cst.gridy = 4;
        center.add(spc1,cst);
        
        logB = new JButton("Login");
        logB.setPreferredSize(new Dimension(300,28));
        cst.fill = GridBagConstraints.HORIZONTAL;
        cst.gridwidth = 3;
        cst.gridx = 0;
        cst.gridy = 5;
        center.add(logB,cst);
        
        logB.addActionListener(this);
        
        mainP.add(header, BorderLayout.PAGE_START);
        mainP.add(center);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                new GUIPT3();
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String uname = unameT.getText();
        char[] pword = pwordPF.getPassword();
        String pass = new String(pword);
        if(uname.equals("user123")&& pass.equals("1234")){
            {
        dashboard();
            }
        }else
        {
            JOptionPane.showMessageDialog(null,"Login Failed");
        }
    }
    
    public void dashboard(){
        db = new JFrame("Dashboard");
        header2 = new JPanel();
        header2.setBackground(Color.BLACK);
        dbL = new JLabel("Dashboard");
        dbL.setFont(new Font("Consolas",Font.BOLD,20));
        dbL.setForeground(Color.WHITE);
        header2.add(dbL);
        center2 = new JPanel();
        
        db.add(header2, BorderLayout.PAGE_START);
        db.add(center2, BorderLayout.CENTER);
        db.setDefaultCloseOperation(3);
        db.setSize(500,300);
        db.setLocationRelativeTo(null);
        db.setResizable(false);
        db.setVisible(true);
        f.setVisible(false);
    }
}