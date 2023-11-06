//Author
//Nama     : Akhmad Sobirin
//Kelas    : PBO TI Sore
//NIM      : 22205069
//Deskripsi Program : Program ini menampilkan Rata-rata Nilai

import java.util.Scanner;

public class TI_RegulerSore_22205069_Latihan21_Program_Ratarata_Nilai {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        int banyakMahasiswa = input.nextInt();
        double total = 0;

        for (int i = 1; i <= banyakMahasiswa; i++) {
            System.out.print("Nilai Mahasiswa ke-" + i + " : ");
            double nilai = input.nextDouble();
            total += nilai;
        }

        double rataRata = total / banyakMahasiswa;
        System.out.println();
        System.out.println("Maka, Rata-rata Nilainya adalah : " + rataRata);
    }
}