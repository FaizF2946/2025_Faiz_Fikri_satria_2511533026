package Tugas2;
import java.util.Scanner;

public class tugasAlproPekan7_2511533026 {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input data
	        System.out.print("Masukkan Username: ");
	        String username = scanner.nextLine().trim();

	        System.out.print("Masukkan Password: ");
	        String password = scanner.nextLine().trim();

	        System.out.print("Masukkan Email: ");
	        String email = scanner.nextLine().trim();

	        System.out.print("Masukkan PIN (6 digit): ");
	        int pinAngka = 0;
	        try {
	            pinAngka = scanner.nextInt();
	        } catch (Exception e) {
	            System.out.println("--- REGISTRASI GAGAL ---");
	            System.out.println("PIN harus berupa angka. Silakan coba lagi.");
	            scanner.close();
	            return;
	        }

	        // Membuat object Akun
	        Akun akun = new Akun(username, password, email, pinAngka);

	        // Validasi data
	        if (!akun.isPasswordValid()) {
	            System.out.println("--- REGISTRASI GAGAL ---");
	            System.out.println("Password Anda \"" + password + "\" tidak valid (harus minimal 8 karakter). Silakan coba lagi.");
	        } else if (!akun.isEmailValid()) {
	            System.out.println("--- REGISTRASI GAGAL ---");
	            System.out.println("Email Anda \"" + email + "\" tidak valid (harus mengandung '@' dan '.'). Silakan coba lagi.");
	        } else {
	            // Registrasi berhasil
	            System.out.println("--- REGISTRASI BERHASIL ---");
	            System.out.println("Akun untuk \"" + username + "\" telah berhasil dibuat.");
	            System.out.println("--- Detail Akun ---");
	            System.out.println("Username (Lowercase): " + username.toLowerCase());
	            System.out.println("Email (Uppercase): " + email.toUpperCase());
	            System.out.println("ID Pengguna (gabungan): " + username + pinAngka);
	            System.out.println("Tipe Data (PIN Anda: " + pinAngka + ") ---");
	            System.out.println("PIN (int) + 10 = " + (pinAngka + 10));
	        }

	        scanner.close();
	    }
	}


