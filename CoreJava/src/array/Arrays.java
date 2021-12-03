package array;
import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        int[] arr = new int[5];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(arr[i] * 2);
        }
    }
}
