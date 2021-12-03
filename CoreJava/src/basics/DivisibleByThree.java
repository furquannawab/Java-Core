package basics;
import java.util.Scanner;

public class DivisibleByThree {
    public static void main(String[] args) {
        int number;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        number = scanner.nextInt();

        if(number % 3 == 0)
            System.out.println("The number is divisible by 3");
        else
            System.out.println("The number is NOT divisible by 3");
    }
}
