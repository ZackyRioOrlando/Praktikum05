import java.util.Scanner;

public class SistemParkir27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jenis kendaraan (mobil/motor): ");
        String jenisKendaraan = sc.nextLine().toLowerCase();

        System.out.print("Masukkan lama parkir (dalam jam): ");
        int jamParkir = sc.nextInt();

        int biayaPerJam = 0;

        if (jenisKendaraan.equals("mobil")) {
            biayaPerJam = 5000;
        } else if (jenisKendaraan.equals("motor")) {
            biayaPerJam = 3000;
        } else {
            System.out.println("Jenis kendaraan tidak valid. Silakan masukkan 'mobil' atau 'motor'.");
            return;
        }

        int totalBiaya = biayaPerJam * jamParkir;

        System.out.println("Jenis kendaraan: " + jenisKendaraan);
        System.out.println("Lama parkir: " + jamParkir + " jam");
        System.out.println("Total biaya parkir: Rp " + totalBiaya);
    }
}
