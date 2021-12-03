package string;

import java.util.ArrayList;
import java.util.Scanner;

public class NamePermutations {
    public static void main(String[] args){
        ArrayList<String> f = new ArrayList<>();
        ArrayList<String> l = new ArrayList<>();

        String name,first,last;
        int space;

        Scanner sc = new Scanner(System.in);

        for(int i=1; i<=5; i++){
            System.out.println("Enter first and last names:");
            name = sc.nextLine();
            space = name.indexOf(" ");
            first = name.substring(0,space);
            last = name.substring(space+1);

            f.add(first);
            l.add(last);
        }

        for(int i=0; i<5; i++)
            for(int j=0; j<5; j++){
                System.out.println(f.get(i)+" "+l.get(j));
            }
    }
}
