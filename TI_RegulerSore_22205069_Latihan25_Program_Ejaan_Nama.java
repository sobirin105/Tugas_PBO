//Author
//Nama   : Akhmad Sobirin
//Kelas  : PBO TI Sore
//NIM    : 22205069
//Deskripsi Program : Program ini menampilkan Program Ejaan Nama

import java.util.Scanner;

public class TI_RegulerSore_22205069_Latihan25_Program_Ejaan_Nama {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama depan anda untuk di eja: ");
        String nama = input.next();

        System.out.println();
        System.out.println("Ejaan untuk " + nama + " adalah :");
        for (int i = 0; i < nama.length(); i++) {
            System.out.println("Huruf ke-" + (i + 1) + " : " + nama.charAt(i));
        }

        // Menutup scanner
        input.close();
    }
}
