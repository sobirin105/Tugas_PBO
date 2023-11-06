//Author
//Nama    : Akhmad Sobirin
//Kelas   : PBO TI Sore
//NIM     : 22205069
//Deskripsi Program : Program ini menampilkan Nilai Terbesar dan Terkecil

import java.util.Scanner;

public class TI_RegulerSore_22205069_Latihan23_Program_Nilai_Terbesar_dan_Terkecil {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("==== Program Nilai Terbesar dan Terkecil Nilai Mahasiswa =====");
        System.out.print("Masukkan Nama Petugas : ");
        String namaPetugas = input.nextLine();

        System.out.print("Masukkan Banyaknya Nilai Mahasiswa : ");
        int banyakNilai = input.nextInt();
        int[] nilaiMahasiswa = new int[banyakNilai];

        for (int i = 0; i < banyakNilai; i++) {
            System.out.print("Masukkan Nilai Mahasiswa Ke-" + (i + 1) + " : ");
            nilaiMahasiswa[i] = input.nextInt();
        }

        int nilaiTerbesar = nilaiMahasiswa[0];
        int nilaiTerkecil = nilaiMahasiswa[0];

        for (int i = 1; i < banyakNilai; i++) {
            if (nilaiMahasiswa[i] > nilaiTerbesar) {
                nilaiTerbesar = nilaiMahasiswa[i];
            }
            if (nilaiMahasiswa[i] < nilaiTerkecil) {
                nilaiTerkecil = nilaiMahasiswa[i];
            }
        }
        System.out.println();
        System.out.println("==== Hasil Nilai Mahasiswa ====");

        for (int i = 0; i < banyakNilai; i++) {
            System.out.println("Nilai Mahasiswa Ke-" + (i + 1) + " : " + nilaiMahasiswa[i]);
        }
        System.out.println();
        System.out.println("Nilai Terbesar adalah : " + nilaiTerbesar);
        System.out.println("Nilai Terkecil adalah : " + nilaiTerkecil);

        input.close();
    }
}