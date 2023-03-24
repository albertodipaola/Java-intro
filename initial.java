import java.util.Scanner;

public class initial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Scrivi una stringa: ");
        String string = scanner.nextLine();
        scanner.close();

        String[] words = string.toLowerCase().split(" ");
        String res="";
        for (String str : words) {
            res+=str.charAt(0)+" ";
        }

        System.out.println("Le iniziali sono "+res);
    }
}
