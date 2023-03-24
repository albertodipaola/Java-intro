import java.util.Scanner;

public class inverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Scrivi un numero: ");
        String num = scanner.nextLine();
        scanner.close();

        String res = "";

        for (int i = num.length()-1; i >= 0; i--) {
            res += num.charAt(i);
        }

        System.out.println("L'inverso è "+ res);
    }
}
