import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Scrivi una parola: ");
        String word = scanner.nextLine();
        scanner.close();

        String word2 = "";
        for (int i = word.length()-1; i >= 0; i--) {
            word2 += word.charAt(i);
        }

        if (word.equals(word2)) {
            System.out.println(word+" è palindoma");
        } else {
            System.out.println(word+" NON è palindoma");
        }
    }
}
