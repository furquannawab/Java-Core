package files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TwiceData {
    public static void main(String[] args) {
        int n;
        Scanner numbers;
        PrintWriter pw;

        try{
            numbers = new Scanner(new File("nums.txt"));
            pw = new PrintWriter("twice_nums.txt");

            while(numbers.hasNext()){
                n = numbers.nextInt();
                pw.println(n*2);
            }
            numbers.close();
            pw.close();
        }
        catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
}
