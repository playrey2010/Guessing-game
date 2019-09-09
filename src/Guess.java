import java.util.Random;
import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int answer = 1 + r.nextInt(10);
        int guess = 0;

        System.out.println("I have chosen a number between 1 and 10. Try to guess it.");
        System.out.print("Your guess: ");
        guess = sc.nextInt();
        while (answer != guess) {
            System.out.println("That is incorrect. Guess again. ");
            System.out.print("Your guess: ");
            guess = sc.nextInt();
        }
//        System.out.println("Your guess: " + guess);
        System.out.println("That's right! You're a good guesser.");

    }
}
