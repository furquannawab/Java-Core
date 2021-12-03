package basics;
import java.util.Scanner;

public class AverageOfThree {
    public static void main(String[] args){
        double num1, num2, num3, average;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three numbers");

        num1 = scanner.nextDouble();
        num2 = scanner.nextDouble();
        num3 = scanner.nextDouble();

        average = (num1 + num2 + num3)/3;

        System.out.println(average);
    }
}
