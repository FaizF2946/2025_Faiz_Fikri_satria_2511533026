package Tugas2;
import java.util.Random;
import java.util.Scanner;

import java.util.Random;
import java.util.Scanner;

public class tugaslempardadu_2511533026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int angkaRahasia = rand.nextInt(10) + 1;  // 1 sampai 10
        int tebakan;
        int percobaan = 0;
        String jawaban;
        boolean menang = false;

        // Perulangan utama: maks 5 kali
        do {
            percobaan++;

            // Input tebakan
            System.out.print("Tebakan Anda: ");
            tebakan = sc.nextInt();

            // Tampilkan operasi penjumlahan
            System.out.println(tebakan + " + " + angkaRahasia + " = " + (tebakan + angkaRahasia));

            // Cek benar/salah
            if (tebakan == angkaRahasia) {
                System.out.println("Tebakan Anda Benar");
                menang = true;
                break;
            } else {
                System.out.println("Tebakan Anda Salah");
            }

            // Jika sudah 5 percobaan, keluar
            if (percobaan == 5) {
                break;
            }

            // Tanya lanjut (kecuali percobaan ke-5)
            System.out.print("Apakah mau lempar dadu (ya / tidak)? ");
            jawaban = sc.next();

            if (jawaban.equalsIgnoreCase("tidak")) {
                break;
            }

        } while (percobaan < 5);

        // Hasil akhir
        if (menang) {
            System.out.println("Anda menang setelah " + percobaan + " percobaan!");
        } else {
            System.out.println("Anda gagal menang");
        }

        sc.close();
    }
}