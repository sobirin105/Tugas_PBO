//Author
//Nama   : Akhmad Sobirin
//Kelas  : PBO TI Sore
//NIM    : 22205069
//Deskripsi Program : Program ini menampilkan Progran Format Huruf Besar dan Kecil

import java.util.Scanner;

public class TI_RegulerSore_22205069_Latihan27_Program_Format_Huruf_Besar_Kecil {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan sebuah kalimat: ");
        String kalimat = input.nextLine();

        System.out.println();
        System.out.println("==== Hasil Formatting ====");
        System.out.printf("%-30s %s%n", "Kalimat dalam format huruf besar:", kalimat.toUpperCase());
        System.out.printf("%-30s %s%n", "Kalimat dalam format huruf kecil:", kalimat.toLowerCase());

        input.close();
    }
}