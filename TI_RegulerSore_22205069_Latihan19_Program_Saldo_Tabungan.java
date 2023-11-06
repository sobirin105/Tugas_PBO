//Author
//Nama     : Akhmad Sobirin
//Kelas    : PBO TI Sore
//NIM      : 22205069
//Deskripsi Program : Program menampilkan saldo tabungan

public class TI_RegulerSore_22205069_Latihan19_Program_Saldo_Tabungan {
    public static void main(String[] args) {
        double saldoAwal = 2500000; // TI_RegulerSore_22205069_Latihan19_Program_Saldo_Tabungan awal
        double bungaPerBulan = 0.15; // Bunga per bulan (15%)
        int lamaBulan = 6; // Lama dalam bulan

        // Menghitung Saldo_19 tabungan setiap bulan
        for (int bulan = 1; bulan <= lamaBulan; bulan++) {
            saldoAwal = saldoAwal + (saldoAwal * bungaPerBulan);
            System.out.println("Saldo bulan ke-" + bulan + " Rp." + Math.round(saldoAwal));
        }
    }
}
