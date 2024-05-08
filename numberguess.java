import java.util.*;
import java.util.Random;

class NumberGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int num = rand.nextInt(100);
        System.out.println("This is the Number Guessing Game");
        System.out.println("I have selected a random number between 0 and 99. Try to guess it!");
        
        int guess;
        int attempts= 0;
        boolean hasGuessed = false;
        
        while (!hasGuessed) {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            attempts++;
            
            if (guess < num) {
                System.out.println("Too low, Try again.");
            } else if (guess > num) {
                System.out.println("Too high, Try again.");
            } else {
                System.out.println("Congratulations! You guessed the number " + num + "You're right");
                System.out.println("Number of attempts: " + attempts);
                hasGuessed = true;
            }
        }
        sc.close();
    }
}
