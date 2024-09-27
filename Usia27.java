import java.util.Scanner;

public class Usia27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan usia Anda: ");
        
        if (!sc.hasNextInt()) {
            System.out.println("Input tidak valid. Harap masukkan angka positif.");
            return; 
        }

        int usia = sc.nextInt();

        if (usia < 0) {
            System.out.println("Input tidak valid. Harap masukkan angka positif.");
            return;
        }

        String kategori;
        if (usia >= 0 && usia <= 12) {
            kategori = "Anak";
        } else if (usia >= 13 && usia <= 19) {
            kategori = "Remaja";
        } else if (usia >= 20 && usia <= 64) {
            kategori = "Dewasa";
        } else {
            kategori = "Lansia";
        }

        System.out.println("Kategori usia Anda: " + kategori);
    }
}

