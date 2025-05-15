import java.util.*;
public class Random_Guessing_Game {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int guess,min = 1, max = 100;
        int attempts = 0;
        int randomNumber = random.nextInt(min, max + 1);
        System.out.println(randomNumber);

        System.out.println("Welcome to the Random Number Guessing Game!");
        System.out.printf("Guess a number between %d and %d.\n",min,max);

        do
        {
            System.out.print("Guess a Number: ");
            guess = sc.nextInt();
            attempts++;

            if(guess < randomNumber)
            {
                System.out.println("Too low! Try again.");
            }
            else if(guess > randomNumber)
            {
                System.out.println("Too high! Try again.");
            }
            else
            {
                System.out.println("Congratulations! You guessed the correct number (" + randomNumber + ").");
                System.out.println("Number of attempts: " + attempts);
            }
        }
        while(guess != randomNumber);

        sc.close();
    }
}