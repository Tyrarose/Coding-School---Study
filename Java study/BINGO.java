import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
public class BINGO extends JFrame {
    JTextField flds[] = new JTextField[25];
    JButton btn = new JButton("SUBMIT");
    JPanel pnl = new JPanel(new GridLayout(5,5, 2, 2));
    TextHandle hld = new TextHandle();
    JLabel lbl = new JLabel("Coded By Ajith Kp");    
    public BINGO()
    {        
        super("BINGO --- AJITH KP");
        setLayout(new BorderLayout());  
        
        lbl.setForeground(Color.BLUE);
        lbl.setFont(new Font("Times New Roman", Font.BOLD, 25));
        lbl.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.green));
        lbl.setHorizontalAlignment(JLabel.CENTER);
        for(int i=0; i<flds.length; i++)
        { 
            flds[i] = new JTextField();
            flds[i].addMouseListener(null);
            flds[i].setForeground(Color.BLACK);
            flds[i].setHorizontalAlignment(JLabel.CENTER);
            flds[i].setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, Color.red));
            flds[i].setBackground(Color.CYAN);
            flds[i].setFont(new Font("Times New Roma", Font.BOLD, 25));
            pnl.add(flds[i]);
        }
        
        
        btn.addActionListener(
                new ActionListener()
                {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        pnl.repaint();
                        int num[] = new int[25];
                        for(int i=0; i<flds.length; i++)
                        {
                            try 
                            {
                                num[i] = Integer.parseInt(flds[i].getText());
                                flds[i].setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, Color.red));
                            } 
                            catch (Exception ex) {
                                Logger.getLogger(BINGO.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                        Boolean flg = false;
                        for(int i=0; i<flds.length; i++)
                        {
                            if(num[i]<1 || num[i]>25)
                            {
                                flds[i].setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.red));
                                flg = true;
                            }
                            for(int j=i+1; j<flds.length; j++)
                            {
                                if(num[i] == num[j])
                                {
                                    flds[i].setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.red));
                                    flds[j].setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.red));
                                    flg = true;
                                }
                            }
                        }
                        if(flg == false)
                        {
                            btn.setEnabled(false);
                            for(int i=0;i<flds.length;i++)
                            {
                                flds[i].setEditable(false);
                                flds[i].setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.green));
                                flds[i].addMouseListener(hld);
                                
                            }
                        }
                    }
                });
        add(pnl, BorderLayout.CENTER);
        add(btn, BorderLayout.SOUTH);
        add(lbl, BorderLayout.NORTH);
    }
    public class TextHandle extends MouseAdapter 
        {
            @Override
            public void mouseClicked(MouseEvent e) {            
                JTextField fld = (JTextField) e.getSource();
                fld.setForeground(Color.red);
                fld.setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.red));
                fld.setText("X");
                check();
            }

            private void check() {
                Boolean check;
                int n = 0;
                char[] bingo = {'B', 'I', 'N', 'G', 'O'};
                String bin = "";
                for(int i=0;i<5;i++)
                {
                    check = false;
                    for(int j= i*5; j< (i+1)*5; j++)
                    {
                        if(!flds[j].getText().equals("X"))
                        {
                            check = true;
                        }
                    }
                    if(check == false)
                    {
                        n++;
                    }
                }
                for(int i=0; i<5; i++)
                {
                    check = false;
                    for(int j=i; j<25; j=j+5)
                    {
                        if(!flds[j].getText().equals("X"))
                        {
                            check = true;
                        }
                    }
                    System.out.println();
                    if(check == false)
                    {
                        n++;
                    }
                }
                if(n!=0)
                {
                    for(int i=0;i<n;i++)
                    {
                        bin+=bingo[i];
                    }
                    lbl.setText(bin);
                }
                if(n==5)
                {
                    lbl.setForeground(Color.red);
                }
            }
        }
    public static void main(String[] args) {
        BINGO b = new BINGO();
        b.setSize(400, 420);
        b.setVisible(true);
        b.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}