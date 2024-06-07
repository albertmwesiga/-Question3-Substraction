
package com.mycompany.substraction;

import java.util.Scanner;
import java.util.Random;

public class Subtraction {
    public static void main(String[] args) {
        // Create a Random object to generate random numbers
        Random random = new Random();
        
        // Generate two single-digit integers
        int number1 = random.nextInt(10);  // 0 to 9
        int number2 = random.nextInt(10);  // 0 to 9

        // Ensure number1 is greater than or equal to number2
        if (number1 < number2) {
            // Swap number1 and number2
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }

        // Prompt the student with the subtraction question
        System.out.print("What is " + number1 + " - " + number2 + "? ");

        // Read the student's answer
        Scanner scanner = new Scanner(System.in);
        int studentAnswer = scanner.nextInt();

        // Check if the answer is correct
        int correctAnswer = number1 - number2;
        if (studentAnswer == correctAnswer) {
            System.out.println("Correct!");
        } else {
            System.out.println("Incorrect. The correct answer is " + correctAnswer + ".");
        }

        scanner.close();  // Close the scanner
    }
}
