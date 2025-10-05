package Tugas2;

import java.util.Scanner;

import java.util.Scanner;
public class tugasAlproPekan4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.println("===== INPUT DATA PEMBELIAN =====");
        System.out.print("Nama Pembeli: ");
        String nama = scanner.nextLine();
        System.out.print("Jumlah Tiket: ");
        int jumlahTiket = scanner.nextInt();
        System.out.print("Hari (1=Senin-Kamis, 2=Jumat, 3=Sabtu-Minggu): ");
        int hari = scanner.nextInt();
        System.out.print("Waktu Tayang (1=Pagi, 2=Siang, 3=Malam): ");
        int waktu = scanner.nextInt();
        System.out.print("Jenis Studio (1=Regular, 2=Deluxe, 3=Premium): ");
        int studio = scanner.nextInt();

        // Data harga dan nama dalam array untuk kemudahan
        String[] namaHari = {"", "Senin-Kamis", "Jumat", "Sabtu-Minggu"};
        double[] biayaHari = {0, 0, 0.1, 0.3}; // 0%, +10%, +30%
        String[] namaWaktu = {"", "Pagi", "Siang", "Malam"};
        double[] biayaWaktu = {0, -0.1, 0, 0.2}; // -10%, 0%, +20%
        String[] namaStudio = {"", "Regular", "Deluxe", "Premium"};
        double[] biayaStudio = {0, 0, 0.2, 0.4}; // 0%, +20%, +40%

        // Validasi input
        if (hari < 1 || hari > 3) {
            System.out.println("Hari tidak valid!");
            return;
        }
        if (waktu < 1 || waktu > 3) {
            System.out.println("Waktu tayang tidak valid!");
            return;
        }
        if (studio < 1 || studio > 3) {
            System.out.println("Jenis studio tidak valid!");
            return;
        }

        // Perhitungan
        double hargaDasar = 50000;
        double hargaPerTiket = hargaDasar * (1 + biayaHari[hari] + biayaWaktu[waktu] + biayaStudio[studio]);
        double subtotal = hargaPerTiket * jumlahTiket;
        double diskon = jumlahTiket >= 5 ? subtotal * 0.2 : 0;
        double totalBayar = subtotal - diskon;

        // Output
        System.out.println("\n===== PEMBELIAN TIKET BIOSKOP =====");
        System.out.println("Nama Pembeli : " + nama);
        System.out.println("Jumlah Tiket : " + jumlahTiket);
        System.out.println("Hari : " + namaHari[hari]);
        System.out.println("Waktu Tayang : " + namaWaktu[waktu]);
        System.out.println("Jenis Studio : " + namaStudio[studio]);
        System.out.println("------------------------------------");
        System.out.println("Harga Dasar : Rp " + (int)hargaDasar + "/tiket");
        System.out.println("Biaya Hari : " + (biayaHari[hari] >= 0 ? "+" : "") + (int)(biayaHari[hari] * 100) + "%");
        System.out.println("Biaya Waktu : " + (biayaWaktu[waktu] >= 0 ? "+" : "") + (int)(biayaWaktu[waktu] * 100) + "%");
        System.out.println("Harga per Tiket : Rp " + (int)hargaPerTiket);
        System.out.println("Subtotal : Rp " + (int)subtotal);
        if (diskon > 0) System.out.println("Diskon (20%) : Rp " + (int)diskon);
        System.out.println("------------------------------------");
        System.out.println("TOTAL BAYAR : Rp " + (int)totalBayar);

        scanner.close();
    }
    
}
