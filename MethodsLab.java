/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package methodslab;

/**
 *
 * @author Admin
 */
import java.util.Scanner;

public class MethodsLab {

    /**
     * @param args the command line arguments
     */
    // Task 1: Greeting method
    static void greetUser() {
        System.out.println("Hello, welcome to the Math Program!");
    }

    // Task 2: Addition
    static int add(int a, int b) {
        return a + b;
    }

    // Subtraction
    static int subtract(int a, int b) {
        return a - b;
    }

    // Multiplication
    static int multiply(int a, int b) {
        return a * b;
    }

    // Division
    static double divide(double a, double b) {
        return a / b;
    }

    // Task 3: Factorial
    static int factorial(int n) {
        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        return fact;
    }

    // Task 4: Sum of array
    static int sumArray(int[] numbers) {
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }

        return sum;
    }

    // Task 5: Check prime number
    static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Call greeting method
        greetUser();

        // Input two numbers
        System.out.print("Enter two numbers: ");
        int a = input.nextInt();
        int b = input.nextInt();

        // Display arithmetic results
        int sum = add(a, b);
        System.out.println("Addition: " + sum);

        int difference = subtract(a, b);
        System.out.println("Subtraction: " + difference);

        int product = multiply(a, b);
        System.out.println("Multiplication: " + product);

        if (b != 0) {
            double quotient = divide(a, b);
            System.out.println("Division: " + quotient);
        } else {
            System.out.println("Cannot divide by zero.");
        }

        // Input number for factorial
        System.out.print("Enter a number for factorial: ");
        int n = input.nextInt();

        if (n >= 0 && n <= 12) {
            int result = factorial(n);
            System.out.println("Factorial: " + result);
        } else {
            System.out.println("Enter a number from 0 to 12.");
        }

        // Initialize five numbers in an array
        int[] numbers = {10, 20, 15, 5, 25};

        int total = sumArray(numbers);
        System.out.println("Sum of array elements: " + total);

        // Input number to check prime
        System.out.print("Enter a number to check prime: ");
        int number = input.nextInt();

        if (isPrime(number)) {
            System.out.println(number + " is prime.");
        } else {
            System.out.println(number + " is not prime.");
        }

        input.close();
    }
}
