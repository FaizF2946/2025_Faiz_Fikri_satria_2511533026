package Tugas_Pekan_Delapan_2511533026;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Tugas_Pekan_Delapan_2511533026 extends JFrame {

    private JComboBox<String> cbBoolean1;
    private JComboBox<String> cbBoolean2;
    private JTextArea txtHasil;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                Tugas_Pekan_Delapan_2511533026 frame = new Tugas_Pekan_Delapan_2511533026();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public Tugas_Pekan_Delapan_2511533026() {
        setTitle("Operator Logika Boolean");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 460, 380);
        setResizable(false);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        getContentPane().add(panel);

        // Judul
        JLabel lblJudul = new JLabel("OPERATOR LOGIKA BOOLEAN");
        lblJudul.setFont(new Font("Tahoma", Font.BOLD, 16));
        lblJudul.setHorizontalAlignment(SwingConstants.CENTER);
        lblJudul.setBounds(50, 10, 350, 30);
        panel.add(lblJudul);

        // Input Boolean 1
        JLabel lblBool1 = new JLabel("Input nilai boolean-1 (true / false) :");
        lblBool1.setBounds(30, 60, 250, 20);
        panel.add(lblBool1);

        cbBoolean1 = new JComboBox<>(new String[]{"false", "true"});
        cbBoolean1.setBounds(280, 60, 100, 25);
        panel.add(cbBoolean1);

        // Input Boolean 2
        JLabel lblBool2 = new JLabel("Input nilai boolean-2 (true / false) :");
        lblBool2.setBounds(30, 100, 250, 20);
        panel.add(lblBool2);

        cbBoolean2 = new JComboBox<>(new String[]{"false", "true"});
        cbBoolean2.setBounds(280, 100, 100, 25);
        panel.add(cbBoolean2);

        // Tombol Hitung
        JButton btnHitung = new JButton("Hitung");
        btnHitung.setBounds(170, 150, 100, 30);
        panel.add(btnHitung);

        // Area hasil
        txtHasil = new JTextArea();
        txtHasil.setEditable(false);
        txtHasil.setFont(new Font("Consolas", Font.PLAIN, 14));
        txtHasil.setBackground(new Color(40, 44, 52));
        txtHasil.setForeground(Color.WHITE);
        
        JScrollPane scroll = new JScrollPane(txtHasil);
        scroll.setBounds(30, 200, 390, 130);
        panel.add(scroll);

        // Action ketika tombol ditekan
        btnHitung.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                boolean A1 = cbBoolean1.getSelectedIndex() == 1; // true jika index 1
                boolean A2 = cbBoolean2.getSelectedIndex() == 1;

                StringBuilder sb = new StringBuilder();
                sb.append("A1 = ").append(A1).append("\n");
                sb.append("A2 = ").append(A2).append("\n");
                sb.append("Konjungsi\n");
                sb.append("true and ").append(A2 ? "true" : "false").append(" = ").append(A1 && A2).append("\n");
                sb.append("Disjungsi\n");
                sb.append("true or false = ").append(A1 || A2).append("\n");
                sb.append("Negasi\n");
                sb.append("bukan ").append(A1 ? "true" : "false").append(" = ").append(!A1).append("\n");
                sb.append("bukan ").append(A2 ? "true" : "false").append(" = ").append(!A2);

                txtHasil.setText(sb.toString());
            }
        });

        // Nilai default sesuai gambar (A1=false, A2=true)
        cbBoolean1.setSelectedIndex(0); // false
        cbBoolean2.setSelectedIndex(1); // true
    }
}