import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.MatteBorder;
import javax.swing.UIManager;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Component;
import javax.swing.JRadioButton;

public class SimpleCalculator {

	private JFrame frame;
	private JTextField textR;
	double n1;
	double n2;
	double result;
	String Op;
	String Ans;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SimpleCalculator window = new SimpleCalculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SimpleCalculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 18));
		frame.getContentPane().setForeground(Color.GRAY);
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.setBounds(100, 100, 370, 555);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textR = new JTextField();
		textR.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textR.setForeground(Color.BLACK);
		textR.setBackground(Color.WHITE);
		textR.setHorizontalAlignment(SwingConstants.RIGHT);
		textR.setBounds(15, 15, 327, 60);
		frame.getContentPane().add(textR);
		textR.setColumns(10);
		
		///---------ROW 1-------------
		JButton btnAC = new JButton("CLEAR");
		btnAC.setBackground(Color.RED);
		btnAC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textR.setText(null);
			}
		});
		
		btnAC.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnAC.setBorder(null);
		btnAC.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnAC.setForeground(new Color(255, 255, 255));
		btnAC.setBounds(15, 85, 158, 70);
		frame.getContentPane().add(btnAC);
		
		JButton btnOps = new JButton("+/-");
		btnOps.setBackground(Color.ORANGE);
		btnOps.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops =Double.parseDouble(String.valueOf(textR.getText()));
				ops = ops*(-1);
				textR.setText(String.valueOf(ops));
				
			}
		});
		btnOps.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnOps.setBounds(185, 88, 70, 70);
		frame.getContentPane().add(btnOps);
		
		JButton btnD = new JButton("/");
		btnD.setBackground(Color.ORANGE);
		
		btnD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n1 = Double.parseDouble(textR.getText());
				textR.setText("");
				Op="/";
						
			}
		});
		btnD.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnD.setBounds(270, 85, 70, 70);
		frame.getContentPane().add(btnD);
		
		//-----------ROW 2------------
		JButton btn7 = new JButton("7");
		btn7.setBackground(Color.WHITE);
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textR.getText() + btn7.getText();
				textR.setText(EnterNumber);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn7.setBounds(15, 170, 70, 70);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.setBackground(Color.WHITE);
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textR.getText() + btn8.getText();
				textR.setText(EnterNumber);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn8.setBounds(100, 170, 70, 70);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.setBackground(Color.WHITE);
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textR.getText() + btn9.getText();
				textR.setText(EnterNumber);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn9.setBounds(185, 170, 70, 70);
		frame.getContentPane().add(btn9);
		
		JButton btnMulti = new JButton("*");
		btnMulti.setBackground(Color.ORANGE);
		
		btnMulti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n1 = Double.parseDouble(textR.getText());
				textR.setText("");
				Op="*";
						
			}
		});
		btnMulti.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnMulti.setBounds(270, 170, 70, 70);
		frame.getContentPane().add(btnMulti);
		
		//-----------ROW 3------------
		JButton btn4 = new JButton("4");
		btn4.setBackground(Color.WHITE);
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textR.getText() + btn4.getText();
				textR.setText(EnterNumber);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn4.setBounds(15, 255, 70, 70);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.setBackground(Color.WHITE);
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textR.getText() + btn5.getText();
				textR.setText(EnterNumber);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn5.setBounds(100, 255, 70, 70);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.setBackground(Color.WHITE);
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textR.getText() + btn6.getText();
				textR.setText(EnterNumber);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn6.setBounds(185, 255, 70, 70);
		frame.getContentPane().add(btn6);
		
		JButton btnSub = new JButton("-");
		btnSub.setBackground(Color.ORANGE);
		
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n1 = Double.parseDouble(textR.getText());
				textR.setText("");
				Op="-";
						
			}
		});
		btnSub.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnSub.setBounds(270, 255, 70, 70);
		frame.getContentPane().add(btnSub);
		
		
		//-----------ROW 4------------
		JButton btn1 = new JButton("1");
		btn1.setBackground(Color.WHITE);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textR.getText() + btn1.getText();
				textR.setText(EnterNumber);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn1.setBounds(15, 340, 70, 70);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.setBackground(Color.WHITE);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textR.getText() + btn2.getText();
				textR.setText(EnterNumber);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn2.setBounds(100, 340, 70, 70);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.setBackground(Color.WHITE);
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textR.getText() + btn3.getText();
				textR.setText(EnterNumber);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn3.setBounds(185, 340, 70, 70);
		frame.getContentPane().add(btn3);
		
		JButton btnAdd = new JButton("+");
		btnAdd.setBackground(Color.ORANGE);
		
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n1 = Double.parseDouble(textR.getText());
				textR.setText("");
				Op="+";
						
				
			}
		});
		btnAdd.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnAdd.setBounds(270, 340, 70, 70);
		frame.getContentPane().add(btnAdd);
		
		
		//-----------ROW 5------------
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textR.getText() + btn0.getText();
				textR.setText(EnterNumber);
			}
			
		});
		btn0.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn0.setBounds(15, 425, 155, 70);
		frame.getContentPane().add(btn0);
		
	
		
		JButton btnP = new JButton(".");
		btnP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(! textR.getText().contains("."))
		          {
		          textR.setText(textR.getText() + btnP.getText());
		          }
			}
			
		});
		btnP.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnP.setBounds(185, 425, 70, 70);
		frame.getContentPane().add(btnP);
		
		JButton btnE = new JButton("=");
		btnE.setBackground(Color.ORANGE);
	
		btnE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n2= Double.parseDouble(textR.getText());
				if(Op == "+")
				{
					result = n1+n2;
					Ans = String.format("%.2f", result);
					textR.setText(Ans);
					
				}
				if(Op == "-")
				{
					result = n1-n2;
					Ans = String.format("%.2f", result);
					textR.setText(Ans);
					
				}
				if(Op == "*")
				{
					result = n1*n2;
					Ans = String.format("%.2f", result);
					textR.setText(Ans);
					
				}
				if(Op == "/")
				{
					result = n1/n2;
					Ans = String.format("%.4f", result);
					textR.setText(Ans);
					
				}
				
				
			}
		});
		btnE.setForeground(Color.BLACK);
		btnE.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnE.setBounds(270, 425, 70, 70);
		frame.getContentPane().add(btnE);
	}
}