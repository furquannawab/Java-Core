package basics;
import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {

        int randomNumber, input;

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        randomNumber = random.nextInt(100) + 1;


        while(true){

            System.out.println("Enter your guess");
            input = scanner.nextInt();

            if(input >= 1 && input <= 100) {

                if (randomNumber == input) {
                    System.out.println("Congratulations, you guessed the number right.");
                    break;
                }

                else if (input < randomNumber)
                    System.out.println("Your guess was lower than the number");

                else
                    System.out.println("Your guess higher than the number");
            }

            else
                System.out.println("Pick a number between 1 and 100");

        }

    }
}
