import java.util.Scanner;

public class indexEven {
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

        System.out.print("[ ");
        for (int i = 0; i < num; i++) {
            if (i%2 == 0) {
            System.out.print(numbers[i]+" ");
            }
        }
        System.out.print("]\n");
    }
}
