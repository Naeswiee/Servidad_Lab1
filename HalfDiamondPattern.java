import java.util.Scanner;

public class HalfDiamondPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = scanner.nextInt();

        // Print the top half of the pattern
        for (int i = 0; i <= n; i++) {
            System.out.print("*"); // Print the leading star
            for (int j = 1; j <= i; j++) {
                System.out.print(j); // Print ascending numbers
            }
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j); // Print descending numbers
            }
            if (i > 0) {
                System.out.print("*"); // Print the trailing star
            }
            System.out.println(); // Move to the next line
        }

        // Print the bottom half of the pattern
        for (int i = n - 1; i >= 0; i--) {
            System.out.print("*"); // Print the leading star
            for (int j = 1; j <= i; j++) {
                System.out.print(j); // Print ascending numbers
            }
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j); // Print descending numbers
            }
            if (i > 0) {
                System.out.print("*"); // Print the trailing star
            }
            System.out.println(); // Move to the next line
        }

        scanner.close();
    }
}
