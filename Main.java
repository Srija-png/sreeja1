

import java.util.Scanner;

class Employee {
  
    String employeeName;
    double basicSalary;
    double hra;  
    double da;  
    double grossSalary;

  
    public void calculateGrossSalary() {
        hra = 0.20 * basicSalary;  // HRA is 20% of basic salary
        da = 0.10 * basicSalary;   // DA is 10% of basic salary
        grossSalary = basicSalary + hra + da;
    }

   
    public void displayDetails() {
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("HRA (20%): " + hra);
        System.out.println("DA (10%): " + da);
        System.out.println("Gross Salary: " + grossSalary);
    }
}

public class Main {
    public static void main(String[] args) {
               
 Scanner scanner = new Scanner(System.in);

       
        Employee emp = new Employee();

      
        System.out.print("Enter employee name: ");
        emp.employeeName = scanner.nextLine();

        System.out.print("Enter basic salary: ");
        emp.basicSalary = scanner.nextDouble();

   
        emp.calculateGrossSalary();

        emp.displayDetails();
    }
}
