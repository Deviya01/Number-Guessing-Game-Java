import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int number = random.nextInt(100) + 1;
        int guess;
        int attempts = 0;

        System.out.println("===== NUMBER GUESSING GAME =====");

        do {

            System.out.print("Enter your guess: ");
            guess = input.nextInt();

            attempts++;

            if (guess > number) {

                System.out.println("Try a lower number");

            } else if (guess < number) {

                System.out.println("Try a higher number");

            } else {

                System.out.println("Correct guess!");
                System.out.println("You guessed the number in " + attempts + " attempts");

            }
        } while (guess != number);


        input.close();
    }
}
