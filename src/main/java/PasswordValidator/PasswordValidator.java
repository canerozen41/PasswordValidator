import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Şifreyi giriniz: ");
        String password = scanner.nextLine();

        if (isValidPassword(password)) {
            System.out.println("Geçerli Şifre");
        } else {
            System.out.println("Geçersiz Şifre");
        }

        scanner.close();
    }

    public static boolean isValidPassword(String password) {
        // 1. En az 8 karakter içermeli
        if (password.length() < 8) {
            return false;
        }

        // 2. Space karakteri içermemeli
        if (password.contains(" ")) {
            return false;
        }

        // 3. İlk harf büyük harf olmalı
        if (!Character.isUpperCase(password.charAt(0))) {
            return false;
        }

        // 4. Son karakter ? olmalı
        if (password.charAt(password.length() - 1) != '?') {
            return false;
        }

        return true;
    }
}
