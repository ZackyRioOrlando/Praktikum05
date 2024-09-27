import java.util.Scanner;

public class Lalulintas27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        System.out.print("Masukkan warna lampu lalu lintas (merah/kuning/hijau): ");
        String warnaLampu = sc.nextLine().toLowerCase();

        switch (warnaLampu) {
            case "merah":
                System.out.println("Anda harus berhenti.");
                break;
            case "kuning":
                System.out.println("Bersiap untuk berhenti atau lanjutkan jika sudah terlalu dekat dengan lampu.");
                break;
            case "hijau":
                System.out.println("Anda dapat melanjutkan perjalanan.");
                break;
            default:
                System.out.println("Warna lampu tidak valid. Silakan masukkan merah, kuning, atau hijau.");
        }
    }
}