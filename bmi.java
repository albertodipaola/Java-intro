import java.util.Scanner;

public class bmi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quale è la tua altezza (m)? ");
        float h = scanner.nextFloat();
        System.out.println("Quale è il tuo peso (kg)? ");
        float p = scanner.nextFloat();
        scanner.close();

        System.out.println("Il tuo BMI è "+p/Math.pow(h, 2));
    }
}
