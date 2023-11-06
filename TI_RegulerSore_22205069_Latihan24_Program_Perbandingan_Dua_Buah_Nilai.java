//Author
//Nama  : Akhmad Sobirin
//Kelas : PBO TI Sore
//NIM   : 22205069
//Deskripsi Program : Program ini menampilkan Perbandingan Dua Buah Nilai

import java.util.Scanner;

public class TI_RegulerSore_22205069_Latihan24_Program_Perbandingan_Dua_Buah_Nilai {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String ulangi = "Ya";

        while (ulangi.equalsIgnoreCase("Ya")) {
            System.out.println("==== Program Perbandingan Nilai ====");
            System.out.print("Masukkan Nilai Pertama: ");
            double nilaiPertama = input.nextDouble();

            System.out.print("Masukkan Nilai Kedua: ");
            double nilaiKedua = input.nextDouble();

            String hasil;
            if (nilaiPertama > nilaiKedua) {
                hasil = nilaiPertama + " lebih besar dari " + nilaiKedua;
            } else if (nilaiPertama < nilaiKedua) {
                hasil = nilaiPertama + " lebih kecil dari " + nilaiKedua;
            } else {
                hasil = nilaiPertama + " sama dengan " + nilaiKedua;
            }

            System.out.println("Hasil : " + hasil);

            System.out.println();
            System.out.print("Ulangi Aktivitas ? (Ya/Tidak) : ");
            ulangi = input.next();
        }

        // Menutup scanner
        input.close();
    }
}
