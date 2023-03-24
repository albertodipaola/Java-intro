import java.util.Scanner;

public class average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quanti numeri vuoi?: ");
        int num = scanner.nextInt();

        int[] numbers = new int[num];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Scrivi il numero "+(i+1)+": ");
            numbers[i] = scanner.nextInt();
        }
        scanner.close();

        int sum = 0;
        for (int n : numbers) {
            sum += n;
        }

        System.out.println("La media è "+(sum/num));
    }
}
