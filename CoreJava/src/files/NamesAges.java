package files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class NamesAges {
    public static void main(String[] args){
        Scanner names;
        Scanner ages;
        PrintWriter pw;

        String name;
        int age;

        try{
            names = new Scanner(new File("names.txt"));
            ages = new Scanner(new File("ages.txt"));
            pw = new PrintWriter("names_ages.txt");

            while(names.hasNext()){
                name = names.nextLine();
                age = ages.nextInt();

                pw.println(name + " " + age);
            }

            names.close();
            ages.close();
            pw.close();
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
