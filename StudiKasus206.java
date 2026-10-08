import java.util.Scanner;

public class StudiKasus206 {
    public static void main(String[] args) {
        Scanner scanner06 = new Scanner(System.in);

        // Input data mahasiswa
        System.out.print("Nama mahasiswa\t\t\t: ");
        String nama = scanner06.nextLine();
        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA): ");
        String jenisKegiatan = scanner06.nextLine();

        System.out.print("Jumlah dokumen\t\t\t: ");
        int jumlahDokumen = scanner06.nextInt();
        System.out.print("Peringkat juara\t\t\t: ");
        int peringkatJuara = scanner06.nextInt();
        System.out.print("Status pendanaan PKM (1=lolos, 0=tidak): ");
        int statusPkm = scanner06.nextInt();

        // Konversi jenis kegiatan ke huruf kapital agar case-insensitive
        jenisKegiatan = jenisKegiatan.toUpperCase();

        // Logika Cabang Lomba (BELMAWA, BAKORMA, MANDIRI)
        if (jenisKegiatan.equals("BELMAWA") || jenisKegiatan.equals("BAKORMA") || jenisKegiatan.equals("MANDIRI")) {
            if (peringkatJuara >= 1 && peringkatJuara <= 3) {
                if (jumlahDokumen == 4) {
                    System.out.println("Status: Berhak memperoleh dana penghargaan.");
                } else {
                    int kurangDokumen = 4 - jumlahDokumen;
                    System.out.println("Status: Dokumen tidak lengkap (kurang " + kurangDokumen + " dokumen). Dana penghargaan tidak diberikan.");
                }
            } else {
                System.out.println("Status: Tidak memperoleh dana penghargaan (hanya untuk Juara 1/2/3).");
            }
        }

        scanner06.close();
    }
}