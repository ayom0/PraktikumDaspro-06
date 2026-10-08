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

        scanner06.close();
    }
}