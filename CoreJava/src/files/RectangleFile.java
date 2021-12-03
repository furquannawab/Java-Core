package files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class RectangleFile {
    public static void main(String[] args){
        ArrayList<Rectangle> arr = new ArrayList<>();
        getFile(arr);
        printRectangle(arr);
    }

    public static void getFile(ArrayList<Rectangle> arr){
        Scanner file;
        Rectangle r;
        int l, b;
        try{
            file = new Scanner(new File("rectangle_data.txt"));

            while(file.hasNext()){
                l = file.nextInt();
                b = file.nextInt();
                r = new Rectangle(l,b);
                arr.add(r);
            }
            file.close();
        }
        catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }
    }

    public static void printRectangle(ArrayList<Rectangle> arr) {
        for (Rectangle r : arr) {
            System.out.println("Length:" + r.getLength() + " Breadth: " +  r.getBreadth()
                    + " Perimeter: " + r.perimeter() + " Area: " + r.area());
        }
    }

}
