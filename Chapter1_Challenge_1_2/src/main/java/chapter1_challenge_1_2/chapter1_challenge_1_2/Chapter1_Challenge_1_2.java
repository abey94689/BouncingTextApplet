/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package chapter1_challenge_1_2.chapter1_challenge_1_2;

public class Chapter1_Challenge_1_2 {

    public static void main(String[] args) {

        // 1. Initialize array of winning numbers
        String[] winningNumbers = {
            "12-34-56-78-90",
            "33-44-11-66-22",
            "01-02-03-04-05"
        };

        double highestAverage = 0.0;
        String bestTicket = "";

        // 2. for-each loop to analyze each ticket
        for (String ticket : winningNumbers) {

            System.out.println("Analyzing: " + ticket);

            // Remove dashes
            String digitsOnly = ticket.replace("-", "");

            // Convert string to char array
            char[] chars = digitsOnly.toCharArray();

            int sum = 0;

            // 3. for loop to process each digit
            for (int i = 0; i < chars.length; i++) {
                int digit = Character.getNumericValue(chars[i]);
                sum += digit;
            }

            double average = (double) sum / chars.length;

            System.out.println("Digit Sum: " + sum + ", Digit Average: " + average);

            // Check for highest average
            if (average > highestAverage) {
                highestAverage = average;
                bestTicket = ticket;
            }

            System.out.println();
        }

        // 4. Final result
        System.out.println(
            "The winning number with the highest average is: "
            + bestTicket + " with an average of " + highestAverage
        );
    }
}




    

