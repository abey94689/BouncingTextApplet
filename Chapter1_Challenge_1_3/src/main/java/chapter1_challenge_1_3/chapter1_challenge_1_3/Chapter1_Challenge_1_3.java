/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package chapter1_challenge_1_3.chapter1_challenge_1_3;

import java.util.Random;
import java.util.Scanner;
public class Chapter1_Challenge_1_3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        int health = 100;

        // 2. for loop for 5 rooms
        for (int room = 1; room <= 5; room++) {

            System.out.println("Entering room " + room + "...");

            // 3. Random event between 1 and 3
            int event = rand.nextInt(3) + 1;

            switch (event) {

                case 1: // Trap
                    health -= 20;
                    System.out.println("A trap sprung! Health is now " + health + ".");
                    break;

                case 2: // Healing potion
                    health += 15;
                    if (health > 100) {
                        health = 100;
                    }
                    System.out.println(
                        "You found a healing potion! Health is now " + health + "."
                    );
                    break;

                case 3: // Monster
                    int monsterNumber = rand.nextInt(5) + 1;
                    int guess;

                    System.out.print(
                        "A monster appears! Guess a number (1-5) to defeat it: "
                    );

                    // do-while loop for guessing
                    do {
                        guess = scanner.nextInt();

                        if (guess != monsterNumber) {
                            System.out.print("Wrong! Try again: ");
                        }

                    } while (guess != monsterNumber);

                    System.out.println("You defeated the monster!");
                    break;
            }

            // 6. Check defeat
            if (health <= 0) {
                System.out.println("You have been defeated in room " + room + ".");
                break;
            }

            System.out.println("Current health: " + health);
            System.out.println();
        }

        // 7. Victory condition
        if (health > 0) {
            System.out.println(
                "You cleared the dungeon! Victorious with " + health + " health!"
            );
        }
    }
}
 
    

