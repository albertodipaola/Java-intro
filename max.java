import java.util.Scanner;

public class max {
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

        int max = 0;
        for (int n : numbers) {
            if (n > max) {
                max = n;
            }
        }

        System.out.println("Il max è "+max);
    }
}
