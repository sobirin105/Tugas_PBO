//author
//Nama  : Akhmad Sobirin
//Kelas : PBO TI Sore
//NIM   : 22205069
//Deskripsi Program : Program ini berisi program untuk menampilkan tunjangan
//karyawan di sebuah perusahaan software

import java.util.Scanner;

public class TI_RegulerSore_22205069_Latihan17_Program_Tunjangan {

    public static double hitungTunjangan(double gajiPokok, boolean isMarried) {
        return isMarried ? gajiPokok * 0.35 : 0;
    }

    public static double hitungTotalGaji(double gajiPokok, double tunjangan) {
        return gajiPokok + tunjangan;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("===== Program Tunjangan =====");
        // input gajipokok
        System.out.print("Berapa gaji pokok anda perbulan? : " + "Rp.");
        double gajiPokok = scanner.nextDouble();

        // input is married or not
        System.out.print("Apakah anda sudah menikah? (y/n) : ");
        String menikah = scanner.next();

        // Declare tunjangan
        double tunjangan = 0;

        if (menikah.equals("y")) {
            tunjangan = hitungTunjangan(gajiPokok, true);
        } else if (menikah.equals("n")) {
            tunjangan = hitungTunjangan(gajiPokok, false);
        } else {
            System.out.println("Input tidak valid. Masukkan 'y' atau 'n' saja.");
            scanner.close(); // tambahkan scanner.close() di sini
            return; // tambahkan return di sini untuk mengakhiri program
        }

        System.out.println();
        System.out.println("===== Hasil Perhitungan =====");
        System.out.println("Gaji Pokok : " + "Rp." + gajiPokok);
        System.out.println("Tunjangan : " + "Rp." + tunjangan);
        System.out.println("Gaji Total : " + "Rp." + hitungTotalGaji(gajiPokok, tunjangan));

        scanner.close(); // tambahkan scanner.close() di sini
    }
}
