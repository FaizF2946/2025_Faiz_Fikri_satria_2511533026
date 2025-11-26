package Pekan_Sembilan_2511533026;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Kalkulator_2511533026 {

	private JFrame frame;
	private JTextField textField;
	
	double first;
	double second;
	double result;
	String operation;
	String answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Kalkulator_2511533026 window = new Kalkulator_2511533026();
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
	public Kalkulator_2511533026() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 283, 337);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(20, 10, 233, 59);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("\uF0E7");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String backSpace=null;
				if(textField.getText().length()>0)
				{
					StringBuilder str=new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					backSpace=str.toString();
					textField.setText(backSpace);
				}
			}
		});
		btnNewButton.setFont(new Font("Windings", Font.BOLD, 10));
		btnNewButton.setBounds(20, 79, 59, 43);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("7");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnNewButton_1.getText();
				textField.setText(number);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_1.setBounds(20, 121, 59, 43);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("4");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnNewButton_2.getText();
				textField.setText(number);
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_2.setBounds(20, 164, 59, 43);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("C");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_3.setBounds(78, 79, 59, 43);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_1_1 = new JButton("8");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnNewButton_1_1.getText();
				textField.setText(number);
			}
		});
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_1_1.setBounds(78, 121, 59, 43);
		frame.getContentPane().add(btnNewButton_1_1);
		
		JButton btnNewButton_2_1 = new JButton("5");
		btnNewButton_2_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnNewButton_2_1.getText();
				textField.setText(number);
			}
		});
		btnNewButton_2_1.setBounds(78, 164, 59, 43);
		frame.getContentPane().add(btnNewButton_2_1);
		
		JButton btnNewButton_4 = new JButton("00");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnNewButton_4.getText();
				textField.setText(number);
			}
		});
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_4.setBounds(136, 79, 59, 43);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_1_2 = new JButton("9");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnNewButton_1_2.getText();
				textField.setText(number);
			}
		});
		btnNewButton_1_2.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_1_2.setBounds(136, 121, 59, 43);
		frame.getContentPane().add(btnNewButton_1_2);
		
		JButton btnNewButton_2_2 = new JButton("6");
		btnNewButton_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnNewButton_2_2.getText();
				textField.setText(number);
			}
		});
		btnNewButton_2_2.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_2_2.setBounds(136, 164, 59, 43);
		frame.getContentPane().add(btnNewButton_2_2);
		
		JButton btnNewButton_2_3 = new JButton("0");
		btnNewButton_2_3.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_2_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnNewButton_2_3.getText();
				textField.setText(number);
			}
		});
		btnNewButton_2_3.setBounds(20, 249, 59, 43);
		frame.getContentPane().add(btnNewButton_2_3);
		
		JButton btnNewButton_1_3 = new JButton("1");
		btnNewButton_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnNewButton_1_3.getText();
				textField.setText(number);
			}
		});
		btnNewButton_1_3.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_1_3.setBounds(20, 206, 59, 43);
		frame.getContentPane().add(btnNewButton_1_3);
		
		JButton btnNewButton_1_1_1 = new JButton("2");
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnNewButton_1_1_1.getText();
				textField.setText(number);
			}
		});
		btnNewButton_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_1_1_1.setBounds(78, 206, 59, 43);
		frame.getContentPane().add(btnNewButton_1_1_1);
		
		JButton btnNewButton_1_2_1 = new JButton("3");
		btnNewButton_1_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnNewButton_1_2_1.getText();
				textField.setText(number);
			}
		});
		btnNewButton_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_1_2_1.setBounds(136, 206, 59, 43);
		frame.getContentPane().add(btnNewButton_1_2_1);
		
		JButton btnNewButton_2_2_1 = new JButton("=");
		btnNewButton_2_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				second=Double.parseDouble(textField.getText());
				if(operation=="+")
				{
					result=first+second;
					answer=String.format("%.2f",  result);
					textField.setText(answer);
				}
				else if(operation=="-")
				{
					result=first-second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="*")
				{
					result=first*second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="/")
				{
					result=first/second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="%")
				{
					result=first%second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
			}
		});
		btnNewButton_2_2_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_2_2_1.setBounds(136, 249, 59, 43);
		frame.getContentPane().add(btnNewButton_2_2_1);
		
		JButton btnNewButton_2_1_1 = new JButton(".");
		btnNewButton_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_2_1_1.setBounds(78, 249, 59, 43);
		frame.getContentPane().add(btnNewButton_2_1_1);
		
		JButton btnNewButton_4_1 = new JButton("+");
		btnNewButton_4_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="+";
			}
		});
		btnNewButton_4_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_4_1.setBounds(194, 79, 59, 43);
		frame.getContentPane().add(btnNewButton_4_1);
		
		JButton btnNewButton_1_2_2 = new JButton("-");
		btnNewButton_1_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="-";
			}
		});
		btnNewButton_1_2_2.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_1_2_2.setBounds(194, 121, 59, 43);
		frame.getContentPane().add(btnNewButton_1_2_2);
		
		JButton btnNewButton_2_2_2 = new JButton("*");
		btnNewButton_2_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="*";
			}
		});
		btnNewButton_2_2_2.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_2_2_2.setBounds(194, 164, 59, 43);
		frame.getContentPane().add(btnNewButton_2_2_2);
		
		JButton btnNewButton_1_2_1_1 = new JButton("/");
		btnNewButton_1_2_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="/";
			}
		});
		btnNewButton_1_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_1_2_1_1.setBounds(194, 206, 59, 43);
		frame.getContentPane().add(btnNewButton_1_2_1_1);
		
		JButton btnNewButton_2_2_1_1 = new JButton("%");
		btnNewButton_2_2_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="%";
			}
		});
		btnNewButton_2_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_2_2_1_1.setBounds(194, 249, 59, 43);
		frame.getContentPane().add(btnNewButton_2_2_1_1);
	}
}
