package array;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayLists {
    public static void main(String[] args) {

        ArrayList<Double> arrayList = new ArrayList<>();
        double d;

        Scanner scanner = new Scanner(System.in);


        while(true){
            d = scanner.nextDouble();
            if(d >= 0)
                arrayList.add(d);
            else
                break;
        }


        for(int i= arrayList.size() - 1; i>=0; i--){
            System.out.println(arrayList.get(i));
        }

    }
}
