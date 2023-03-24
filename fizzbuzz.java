import java.util.Scanner;

public class fizzbuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Scrivi una stringa: ");
        int num = scanner.nextInt();
        scanner.close();

        if (num%3 == 0 && num%5 == 0) {
            System.out.println("Fizzbuzz");
        }
        else{
            if (num%3 == 0) {
                System.out.println("Fizz");
            }
            if (num%5 == 0) {
                System.out.println("buzz");
            }
        }
    }
}
