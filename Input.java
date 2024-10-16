import java.util.InputMismatchException;
import java.util.Scanner;

public class Input{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.print("Please enter an integer: ");
                int number = scanner.nextInt();
                System.out.println("You entered: " + number);
                validInput = true; // Input is valid, exit the loop
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.next(); // Clear the invalid input
            }
        }

        scanner.close();
    }
}
