public class Operations {
    public static void main(String[] args) {
        
       
        int a = 10, b = 5;
        System.out.println("Arithmetic Operations:");
        System.out.println("a + b = " + (a + b));  // Addition
        System.out.println("a - b = " + (a - b));  // Subtraction
        System.out.println("a * b = " + (a * b));  // Multiplication
        System.out.println("a / b = " + (a / b));  // Division
        System.out.println("a % b = " + (a % b));  // Modulus

        
        System.out.println("\nIncrement and Decrement:");
        int x = 10;
        System.out.println("Original x = " + x);
        System.out.println("x++ = " + (x++));  // Post-increment
        System.out.println("After x++: " + x);
        System.out.println("++x = " + (++x));  // Pre-increment
        System.out.println("x-- = " + (x--));  // Post-decrement
        System.out.println("After x--: " + x);
        System.out.println("--x = " + (--x));  // Pre-decrement

        // Logical Operations
        boolean bool1 = true, bool2 = false;
        System.out.println("\nLogical Operations:");
        System.out.println("bool1 && bool2 = " + (bool1 && bool2));  // Logical AND
        System.out.println("bool1 || bool2 = " + (bool1 || bool2));  // Logical OR
        System.out.println("!bool1 = " + (!bool1));  // Logical NOT

        // Boolean comparison (Relational Operations)
        System.out.println("\nBoolean Comparison:");
        System.out.println("a > b: " + (a > b));    // Greater than
        System.out.println("a < b: " + (a < b));    // Less than
        System.out.println("a == b: " + (a == b));  // Equal to
        System.out.println("a != b: " + (a != b));  // Not equal to

        // Assignment Operations
        System.out.println("\nAssignment Operations:");
        int c = a + b; // Simple assignment
        System.out.println("c = a + b: " + c);
        c += a; // c = c + a;
        System.out.println("c += a: " + c);
        c -= a; // c = c - a;
        System.out.println("c -= a: " + c);
        c *= a; // c = c * a;
        System.out.println("c *= a: " + c);
        c /= a; // c = c / a;
        System.out.println("c /= a: " + c);
        c %= a; // c = c % a;
        System.out.println("c %= a: " + c);
    }
}
