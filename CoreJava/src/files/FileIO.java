package files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileIO {
    public static void main(String[] args){
        int number;
        Scanner file;
        int sum = 0;
        try{

            file = new Scanner(new File("input.txt"));

            while(file.hasNext()){
                number = file.nextInt();
                sum += number;
            }

            System.out.println(sum);
            file.close();
        }

        catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }

    }
}
