import java.util.Scanner;

public class StudiKasus106 {
    public static void main(String[] args) {
        Scanner scanner06 = new Scanner(System.in);

        // Deklarasi variabel
        int hargaPerCup = 18000;
        int jumlahCup, uangBayar;
        int totalHarga, diskon, totalBayar;
        int kembalian = 0, kurang = 0;

        // Input jumlah cup dan uang bayar
        System.out.print("Masukkan jumlah cup\t: ");
        jumlahCup = scanner06.nextInt();
        System.out.print("Masukkan uang bayar\t: ");
        uangBayar = scanner06.nextInt();

        // Hitung total harga dan inisialisasi diskon
        totalHarga = jumlahCup * hargaPerCup;
        diskon = 0;

        // Logika pemilihan diskon jika minimal pembelian Rp100.000
        if (totalHarga >= 100000) {
            diskon = totalHarga * 10 / 100;
        }

        totalBayar = totalHarga - diskon;

        // Output rincian harga
        System.out.println("Total harga\t\t: Rp " + totalHarga);
        System.out.println("Diskon\t\t\t: Rp " + diskon);
        System.out.println("Total bayar\t\t: Rp " + totalBayar);

        // Logika pemilihan kecukupan uang
        if (uangBayar >= totalBayar) {
            kembalian = uangBayar - totalBayar;
            System.out.println("Kembalian\t\t: Rp " + kembalian);
        } else {
            kurang = totalBayar - uangBayar;
            System.out.println("Uang tidak cukup, kurang Rp " + kurang);
        }

        scanner06.close();
    }
}