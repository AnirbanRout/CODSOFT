
package projects;

import java.util.*;

public class NumberGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int score = 0, rounds = 0;

        while (true) {
            int number = rand.nextInt(100) + 1;
            int attempts = 5;
            boolean guessed = false;

            System.out.println("\n🎮 New Round Started! Guess a number between 1 and 100");

            while (attempts > 0) {
                System.out.print("Enter your guess: ");
                int guess = sc.nextInt();
                attempts--;

                if (guess == number) {
                    System.out.println("✅ Correct! You win this round.");
                    score++;
                    guessed = true;
                    break;
                } else if (guess > number) {
                    System.out.println("Too high!");
                } else {
                    System.out.println("Too low!");
                }
            }

            if (!guessed) {
                System.out.println("❌ Out of attempts! The number was: " + number);
            }

            rounds++;
            System.out.println("Score: " + score + "/" + rounds);
            System.out.print("Play again? (yes/no): ");
            if (!sc.next().equalsIgnoreCase("yes"))
                break;
        }
        sc.close();
    }
}
