import java.util.Scanner;

public class LoginPas27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        String validUsername = "ZackyRio";
        String validPassword = "123";

        System.out.print("Masukkan username: ");
        String username = sc.nextLine();
        System.out.print("Masukkan password: ");
        String password = sc.nextLine();

        if (username.equals(validUsername) && password.equals(validPassword)) {
            System.out.println("Login berhasil!");
        } else {
            System.out.println("User dan password salah.");
        }
    }
}
