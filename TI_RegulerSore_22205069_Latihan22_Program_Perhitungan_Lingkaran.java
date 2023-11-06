//Author
//Nama    : Akhmad Sobirin
//Kelas   : PBO TI Sore
//NIM     : 22205069
//Deskripsi Program : Program ini menampilkan Perhitungan Lingkaran

import java.util.Scanner;

public class TI_RegulerSore_22205069_Latihan22_Program_Perhitungan_Lingkaran {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("====== Perhitungan Lingkaran ======");
        System.out.print("Masukkan nilai diameter lingkaran: ");
        double diameter = input.nextDouble();

        // Menghitung jari-jari, luas, dan keliling lingkaran
        double jariJari = diameter / 2;
        double luas = Math.PI * jariJari * jariJari;
        double keliling = Math.PI * diameter;

        // Output tampilan
        System.out.println();
        System.out.println("====== Hasil Perhitungan Lingkaran ====== ");
        System.out.println("Jari-jari Lingkaran = " + jariJari + " cm");
        System.out.println("Luas Lingkaran = " + luas + " cm");
        System.out.println("Keliling Lingkaran = " + keliling + " cm");

        // Menutup scanner
        input.close();
    }
}

