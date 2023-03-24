import java.util.Scanner;

/**
 * app
 */
public class password {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci la password: ");
        String password = scanner.nextLine();
        scanner.close();

        if (pwdLenghtCheck(password) && pwdHasNumber(password) && pwdHasUpperCase(password) && pwdHasSpecialNumber(password)) {
            System.out.println(password+" è corretta!!!");
        }
        else{
            System.out.println(password+" NON è corretta!!!");
        }
    }
    
    public static boolean pwdLenghtCheck(String str) {
        return str.length()>= 8;
    }

    public static boolean pwdHasNumber(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    public static boolean pwdHasUpperCase(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    public static boolean pwdHasSpecialNumber(String str) {
        String specialChars = "!£$%&";
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < specialChars.length(); j++) {
                if (str.charAt(i)==specialChars.charAt(j)) {
                    return true;
                }
            }
        }
        return false;
    }
}