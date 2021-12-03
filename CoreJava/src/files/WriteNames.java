package files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class WriteNames {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("Mike");
        arr.add("Tom");
        arr.add("Tony");
        arr.add("Steve");

        Scanner file;

        try{
            PrintWriter pw = new PrintWriter("names.txt");

            for(String s : arr)
                pw.println(s);

            file = new Scanner(new File("names.txt"));

            while(file.hasNext()){
                System.out.println(file.nextLine());
            }

            pw.close();
            file.close();
        }

        catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
}
