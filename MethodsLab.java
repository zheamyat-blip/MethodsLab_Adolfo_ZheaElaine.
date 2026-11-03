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
    // Main Program
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        greetUser();

        // Arithmetic Operations
        System.out.println("--Arithmetic Operations--");
        System.out.print("Enter first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter second number: ");
        int num2 = input.nextInt();

        System.out.println("Addition: " + add(num1, num2));
        System.out.println("Subtraction: " + subtract(num1, num2));
        System.out.println("Multiplication: " + multiply(num1, num2));

        if (num2 == 0) {
            System.out.println("Division: Cannot divide by zero.");
        } else {
            System.out.println("Division: " + divide(num1, num2));
        }

        // Factorial
        System.out.println("Factorial:");
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        if (number >= 0 && number <= 12) {
            System.out.println("Factorial: " + factorial(number));
        } else {
            System.out.println("Invalid input. Enter a number from 0 to 12.");
        }

        // Array Sum
        System.out.println("Array Sum:");
        int[] values = {10, 20, 15, 5, 25};

        System.out.print("Array elements: ");
        for (int value : values) {
            System.out.print(value + " ");
        }

        System.out.println("\nTotal sum: " + sumArray(values));

        // Prime Number
        System.out.println("Prime Number Checker:");
        System.out.print("Enter a number: ");
        int primeNumber = input.nextInt();

        if (isPrime(primeNumber)) {
            System.out.println(primeNumber + " is a prime number.");
        } else {
            System.out.println(primeNumber + " is not a prime number.");
        }

        input.close();
    }

    // Task 1: Greeting
    static void greetUser() {
        System.out.println("Welcome to the Math Program!");
    }

    // Task 2: Basic Calculations
    static int add(int x, int y) {
        return x + y;
    }

    static int subtract(int x, int y) {
        return x - y;
    }

    static int multiply(int x, int y) {
        return x * y;
    }

    static double divide(double x, double y) {
        return x / y;
    }

    // Task 3: Calculate Factorial
    static int factorial(int num) {
        int answer = 1;

        for (int count = num; count > 1; count--) {
            answer *= count;
        }

        return answer;
    }

    // Task 4: Calculate Array Sum
    static int sumArray(int[] arr) {
        int answer = 0;

        for (int value : arr) {
            answer += value;
        }

        return answer;
    }

    // Task 5: Determine Prime Number
    static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }

        for (int divisor = 2; divisor <= num / 2; divisor++) {
            if (num % divisor == 0) {
                return false;
            }
        }

        return true;
    }
}
