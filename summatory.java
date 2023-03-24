import java.util.Scanner;

public class summatory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Scrivi un numero: ");
        String num = scanner.nextLine();
        scanner.close();

        int sum = 0;
        for (char n : num.toCharArray()) {
            sum += Character.getNumericValue(n);
        }

        System.out.println("La sommatoria è "+sum);
    }
}
