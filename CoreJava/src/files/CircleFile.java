package files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class CircleFile {
    public static void main(String[] args){
        ArrayList<Circle> arr = new ArrayList<>();
        getCircle(arr);
        fillFile(arr);
    }




    public static void getCircle(ArrayList<Circle> arr){
        Circle c;
        Scanner file;
        int r;
        try{
            file = new Scanner(new File("circle_data.txt"));
            while(file.hasNext()){
              r = file.nextInt();
              c = new Circle(r);
              arr.add(c);
            }
            file.close();
        }
        catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }
    }



    public static void fillFile(ArrayList<Circle> arr){
        PrintWriter pw;
        try {
            pw = new PrintWriter("circles_output.txt");
            for(Circle c : arr){
                double rad = c.getRadius();
                double area = c.area();
                double circum = c.circumference();
                print(rad, area, circum);

                pw.println(rad + " " + area + " " + circum);
            }

            pw.close();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }


    public static void print(double rad, double a, double c){
        System.out.println("Radius: " + rad + " Area: " + a + " Circum: " + c);
    }
}
