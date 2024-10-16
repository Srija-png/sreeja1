import java.util.Scanner;
public class Bank {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double transactionAmount = 0.0;
        boolean validInput = false;

        while (!validInput) {
            System.out.print("Enter the transaction amount: ");
            String input = scanner.nextLine();

            try {
                              
               transactionAmount = Double.parseDouble(input);
                validInput = true; // If parsing succeeds, mark input as valid
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid numeric amount.");
            }
        }
        System.out.println("Transaction of $" + transactionAmount + " processed successfully.");
        
        scanner.close();
    }
}
