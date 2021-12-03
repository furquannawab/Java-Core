package methods;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SumOfElements {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();

        Random rand = new Random();

        for(int i=0; i<5; i++)
            al.add(rand.nextInt(10));

        int sum = sumElements(al);

        System.out.println(sum);
    }

    public static int sumElements(List<Integer> a){
        int sum = 0;

        for(int x : a){
            sum += x;
        }
        return sum;
    }
}
