package basics;
import java.util.Scanner;

public class MadLibsClone {
    public static void main(String[] args){

        String adj1, girl_name, adj2, occupation1, place, clothing, hobby,
                adj3, occupation2, boys_name, fathers_name;

        Scanner scanner = new Scanner(System.in);

        System.out.println(" Enter an adjective:");
        adj1 = scanner.nextLine();

        System.out.println(" Enter a girl's name:");
        girl_name = scanner.nextLine();

        System.out.println(" Enter an adjective:");
        adj2 = scanner.nextLine();

        System.out.println(" Enter an occupation:");
        occupation1 = scanner.nextLine();

        System.out.println(" Enter a place:");
        place = scanner.nextLine();

        System.out.println(" Enter clothing:");
        clothing = scanner.nextLine();

        System.out.println(" Enter a hobby:");
        hobby = scanner.nextLine();

        System.out.println(" Enter an adjective:");
        adj3 = scanner.nextLine();

        System.out.println(" Enter an occupation:");
        occupation2 = scanner.nextLine();

        System.out.println(" Enter a boy's name");
        boys_name = scanner.nextLine();

        System.out.println(" Enter a man's name");
        fathers_name = scanner.nextLine();



        System.out.println("There once was a " + adj1 + " girl named " + girl_name+ ", who was a "
                + adj2 + " " + occupation1 + " in the Kingdom of " + place + ". ");
        System.out.println("She loved to wear " + clothing + " and to " + hobby + ". ");
        System.out.println("She wanted to marry the " + adj3 + " " + occupation2 +
                " named " + boys_name + " but her father, King " + fathers_name + " forbid her from seeing him");
    }
}
