import java.util.Scanner;

public class evenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Scrivi un numero: ");
        int num = scanner.nextInt();
        scanner.close();

        if (num%2 == 0) {
            System.out.println(num+" è pari");
        } else {
            System.out.println(num+" è dispari");
        }
    }
}
