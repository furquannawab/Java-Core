package array;
import java.util.ArrayList;
import java.util.Scanner;

public class ParallelArrays {
    public static void main(String[] args) {

        String[] name = new String[5];
        ArrayList<Integer> age = new ArrayList<>();
        int a;

        Scanner scanner = new Scanner(System.in);

        for(int i=0; i<5; i++){
            System.out.println("Enter name:");
            name[i] = scanner.nextLine();

            System.out.println("Enter age:");
            a = scanner.nextInt();
            scanner.nextLine();

            age.add(a);
        }

        for(int i=0; i<5; i++){
            System.out.println(name[i] + " is " + age.get(i) + " old.");
        }



    }
}