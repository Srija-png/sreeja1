import java.util.Scanner;

public class Student {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
                System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();
        
             String[] subjects = new String[numSubjects];
        double[] internalMarks = new double[numSubjects];
        
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter the name of subject " + (i + 1) + ": ");
            subjects[i] = scanner.next();
            
           
            System.out.println("Enter marks for " + subjects[i] + ":");
            
            System.out.print("Assignments (out of -40): ");
            double assignments = scanner.nextDouble();
            
            System.out.print("Quizzes (out of 30): ");
            double quizzes = scanner.nextDouble();
            
            System.out.print("Attendance (out of 30): ");
            double attendance = scanner.nextDouble();
            
            
            internalMarks[i] = assignments + quizzes + attendance;
        }
        
        System.out.println("\nInternal Marks for Each Subject:");
        for (int i = 0; i < numSubjects; i++) {
            System.out.println(subjects[i] + ": " + internalMarks[i] + "/100");
        }
        
        scanner.close();
    }
}
