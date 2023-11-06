//Author
//Nama   : Akhmad Sobirin
//Kelas  : PBO TI Sore
//NIM    : 22205069
//Deskripsi Program : Program ini menampilkan Program Warna Kepribadian

import java.util.Scanner;

public class TI_RegulerSore_22205069_Latihan29_Program_Warna_Kepribadian {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String inputanWarna, inputanNama, hasilKepribadian, hasil_inputan_warna;

        System.out.println();
        System.out.println("\u001B[31mYUK \u001B[32mCEK \u001B[33mKEPRIBADIANMU \u001B[36mDARI \u001B[35mWARNA \u001B[34mFAVORITMU\u001B[0m");

        System.out.println();
        System.out.println("\u001B[41mMERAH");
        System.out.println("\u001B[42mHIJAU");
        System.out.println("\u001B[43mKUNING");
        System.out.println("\u001B[44mBIRU");
        System.out.println("\u001B[45mUNGU\u001B[0m");

        System.out.println();

        System.out.print("Pilih warna favoritmu : ");
        inputanWarna = scanner.nextLine();

        System.out.print("Nama kamu : ");
        inputanNama = scanner.nextLine();

        hasilKepribadian = "=== Hasil Test Kepribadian " + inputanNama + " ===";
        hasil_inputan_warna = inputanWarna;

        System.out.println();
        System.out.println(hasilKepribadian.toUpperCase());
        System.out.println();

        if (inputanWarna.equalsIgnoreCase("BIRU")) {
            System.out.println("Warna favoritmu adalah \u001B[34m" + hasil_inputan_warna.toUpperCase() + "\u001B[0m");
            System.out.println("1. Menyenangkan, \n" +
                    "2. Bijaksana, \n" +
                    "3. Pembawaan diri tenang saat menghadapi masalah, \n" +
                    "4. Dinamis, \n" +
                    "5. Senang berbagi, \n" +
                    "6. Bersahabat, \n" +
                    "7. Tidak terlalu suka menjadi sorotan banyak orang, \n" +
                    "8. Menyembunyikan perasaan karena karakternya yang cenderung mencari jalan damai.");
        } else if (inputanWarna.equalsIgnoreCase("KUNING")) {
            System.out.println("Warna favoritmu adalah \u001B[33m" + hasil_inputan_warna.toUpperCase() + "\u001B[0m");
            System.out.println("1. Optimis, \n" +
                    "2. Suka bergaul, \n" +
                    "3. Periang, \n" +
                    "4. Senang menolong, \n" +
                    "5. Lincah dan aktif, \n" +
                    "6. Tidak suka meremehkan kekurangan orang lain, \n" +
                    "7. Loyal, \n" +
                    "8. Hangat, \n" +
                    "9. Meskipun karakternya optimis dan idealis, seringkali goyah dan tidak stabil, \n" +
                    "10.Cenderung penakut.");
        } else if (inputanWarna.equalsIgnoreCase("MERAH")) {
            System.out.println("Warna favoritmu adalah \u001B[31m" + hasil_inputan_warna.toUpperCase() + "\u001B[0m");
            System.out.println("1. Periang, \n" +
                    "2. Pemberani, \n" +
                    "3. Berani mengambil risiko dalam setiap langkah, \n" +
                    "4. Menyukai tantangan, \n" +
                    "5. Kurang sabar, \n" +
                    "6. Dapat menahan marah namun jika sudah tahap puncak toleransi, kemarahannya akan sulit di kontrol, \n" +
                    "7. Memiliki energi kehangatan dan cinta.");
        } else if (inputanWarna.equalsIgnoreCase("UNGU")) {
            System.out.println("Warna favoritmu adalah \u001B[35m" + hasil_inputan_warna.toUpperCase() + "\u001B[0m");
            System.out.println("1. Optimis, \n" +
                    "2. Tidak pernah ragu, \n" +
                    "3. Menurutnya pasangan yang ideal adalah yang memiliki mental yang kuat, \n" +
                    "4. Memiliki ambisi yang besar, \n" +
                    "5. Memiliki empati yang besar, \n" +
                    "6. Memiliki sisi misterius sebab seringkali menutupi perasaanya, \n" +
                    "7. Terkadang bersikap keras kepala dan angkuh.");
        } else if (inputanWarna.equalsIgnoreCase("HIJAU")) {
            System.out.println("Warna favoritmu adalah \u001B[32m" + hasil_inputan_warna.toUpperCase() + "\u001B[0m");
            System.out.println("1. Romantis, \n" +
                    "2. Menyukai hal yang berbau alami dan keindahan, \n" +
                    "3. Teguh pada prinsip, \n" +
                    "4. Menginginkan kesempurnaan, \n" +
                    "5. Mudah cemburu, \n" +
                    "6. Mudah merasa iri, \n" +
                    "7. Menjunjung tinggi suatu nilai toleransi dan kepercayaan.");
        } else {
            System.out.println("Oops, belum teridentifikasi.");
        }
    }
}