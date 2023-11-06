//Author
//Nama   : Akhmad Sobirin
//Kelas  : PBO TI Sore
//NIM    : 22205069
//Deskripsi Program : Program ini menampilkan Program Cakep

import java.util.Scanner;

public class TI_RegulerSore_22205069_Latihan30_Program_Cakep {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Kamu ngerjain sendiri latihan 1 sampai latihan 30 ini?");
        System.out.print("Jawab (Yoi/Enggak) : "); // Perbaikan tanda koma menjadi titik

        String jawaban = input.nextLine();

        System.out.println("");
        if (jawaban.equalsIgnoreCase("Yoi")) {
            System.out.println("Cakep Bener. Good Job!");
        } else if (jawaban.equalsIgnoreCase("Enggak")) {
            System.out.println("Tetep Cakep sih. Yang penting paham konsepnya ya");
        } else {
            System.out.println("Maaf, jawaban tidak valid. Silakan masukkan Yoi atau Enggak");
        }
    }
}