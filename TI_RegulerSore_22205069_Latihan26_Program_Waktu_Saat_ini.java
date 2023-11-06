//Author
//Nama  : Akhmad Sobirin
//Kelas : PBO TI Sore
//NIM   : 22205069
//Deskripsi Program : Program ini menampilkan Waktu Saat Ini

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TI_RegulerSore_22205069_Latihan26_Program_Waktu_Saat_ini {

    public static void main(String[] args) {
        // Mendapatkan waktu saat ini
        LocalDateTime waktuSekarang = LocalDateTime.now();

        // Membuat format tanggal yang diinginkan
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, dd MMMM yyyy HH:mm:ss");

        // Mengonversi waktu menjadi string dengan format yang diinginkan
        String waktuDiformat = waktuSekarang.format(formatter);

        // Menampilkan waktu saat ini dengan format yang telah diformat
        System.out.println("Hari ini adalah hari : " + waktuDiformat);
    }
}
