package pekan_delapan_2511533026;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class OperatorAritmatikaGUI_2511533026 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtAngka1;
	private JTextField txtAngka2;
	private JTextField txtHasil;
	private void pesanPeringantan(String pesan) {
		JOptionPane.showMessageDialog(this,  pesan, "Peringatan", JOptionPane.WARNING_MESSAGE);
	}
	private void pesanError(String pesan) {
		JOptionPane.showMessageDialog(this, pesan, "Kesalahan", JOptionPane.ERROR_MESSAGE);
	}
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OperatorAritmatikaGUI_2511533026 frame = new OperatorAritmatikaGUI_2511533026();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public OperatorAritmatikaGUI_2511533026() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("OPERATOR ARITMATIKA");
		lblNewLabel.setBounds(115, 10, 200, 20);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1_1 = new JLabel("Angka 2");
		lblNewLabel_1_1.setBounds(10, 81, 45, 20);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Operator");
		lblNewLabel_1_2.setBounds(10, 128, 45, 26);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Hasil");
		lblNewLabel_1_2_1.setBounds(10, 196, 45, 26);
		contentPane.add(lblNewLabel_1_2_1);
		
		txtAngka1 = new JTextField();
		txtAngka1.setHorizontalAlignment(SwingConstants.CENTER);
		txtAngka1.setBounds(65, 52, 96, 18);
		contentPane.add(txtAngka1);
		txtAngka1.setColumns(10);
		
		txtAngka2 = new JTextField();
		txtAngka2.setHorizontalAlignment(SwingConstants.CENTER);
		txtAngka2.setColumns(10);
		txtAngka2.setBounds(65, 82, 96, 18);
		contentPane.add(txtAngka2);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Angka 1");
		lblNewLabel_1_1_1.setBounds(10, 51, 45, 20);
		contentPane.add(lblNewLabel_1_1_1);
		
		txtHasil = new JTextField();
		txtHasil.setEditable(false);
		txtHasil.setHorizontalAlignment(SwingConstants.CENTER);
		txtHasil.setColumns(10);
		txtHasil.setBounds(65, 200, 96, 18);
		contentPane.add(txtHasil);
		
		JComboBox CbOperator = new JComboBox();
		CbOperator.setModel(new DefaultComboBoxModel(new String[] {"+", "-", "*", "/", "%"}));
		CbOperator.setBounds(65, 131, 96, 20);
		contentPane.add(CbOperator);
		
		JButton btnNewButton = new JButton("Hitung");
		btnNewButton.addActionListener(new ActionListener() {
			int hasil;
			public void actionPerformed(ActionEvent e) {
				if(txtAngka1.getText().trim().isEmpty()) {
					pesanPeringantan("Inputkan angka 1");
				} else if(txtAngka2.getText().trim().isEmpty()) {
					pesanPeringantan("Inputkan angka 2");
				}else {
					try {
				int a = Integer.valueOf(txtAngka1.getText());
				int b= Integer.valueOf(txtAngka2.getText());
				int c= CbOperator.getSelectedIndex();
				if (c==0) { hasil= a+b;}
				if (c==1) { hasil=a-b; }
				if (c==2) { hasil=a*c; }
				if (c==3) { hasil=a/b; }
				if (c==4) { hasil=a%b; }
				txtHasil.setText (String.valueOf(hasil));
			}catch (NumberFormatException ex) {
				pesanError("Angka 1 dan 2 tidak valid");
			}
			}
		}
		});
		btnNewButton.setBounds(194, 131, 84, 20);
		contentPane.add(btnNewButton);

	}
}
