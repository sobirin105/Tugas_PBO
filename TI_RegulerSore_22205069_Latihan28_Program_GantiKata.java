//Author
//Nama   : Akhmad Sobirin
//Kelas  : PBO TI Sore
//NIM    : 22205069
//Deskripsi Program : Program ini menampilkan program untuk mengganti kata dalam
//sebuah kalimat


import java.util.Scanner;

public class TI_RegulerSore_22205069_Latihan28_Program_GantiKata {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("===== Program Mengganti Kata =====");
        System.out.print("Masukkan kalimat: ");
        String kalimatAwal = input.nextLine();

        System.out.print("Ganti Kata: ");
        String kataLama = input.next();

        System.out.print("Menjadi Kata: ");
        String kataBaru = input.next();

        String kalimatBaru = gantiKata(kalimatAwal, kataLama, kataBaru);
        System.out.println();
        System.out.println("====== Hasil Formatting =====");
        System.out.println("Kalimat Awal: " + kalimatAwal);
        System.out.println("Kalimat Baru: " + kalimatBaru);
    }

    public static String gantiKata(String kalimat, String kataLama, String kataBaru) {
        return kalimat.replaceAll(kataLama, kataBaru);
    }
}