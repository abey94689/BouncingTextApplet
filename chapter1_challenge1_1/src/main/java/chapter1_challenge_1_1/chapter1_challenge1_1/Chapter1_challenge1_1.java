/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package chapter1_challenge_1_1.chapter1_challenge1_1;

import java.util.Scanner;

public class Chapter1_challenge1_1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Input
        int number = scanner.nextInt();

        // Number of digits
        int digits = (int) Math.log10(number) + 1;

        // Extract digits using operators only
        int firstDigit = number / (int) Math.pow(10, digits - 1);
        int lastDigit = number % 10;

        int secondDigit = (number / (int) Math.pow(10, digits - 2)) % 10;
        int secondLastDigit = (number / 10) % 10;

        // Required calculations
        int product = firstDigit * lastDigit;
        int sum = secondDigit + secondLastDigit;

        // Final decrypted code
        String decryptedCode = "" + product + sum;

        // Output
        System.out.println("The decrypted code is: " + decryptedCode);
    }
}

 
