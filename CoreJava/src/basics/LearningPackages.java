package basics;
import java.util.Scanner;

public class LearningPackages {
    public static void main(String[] args){
        int packageNumber, coursesEnrolled, totalCost =0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Learning Stars!");

        System.out.println("Enter the package number(1, 2, 3): ");
        packageNumber = scanner.nextInt();

        System.out.println("Enter the number of courses: ");
        coursesEnrolled = scanner.nextInt();

        if(packageNumber == 1){
            if(coursesEnrolled > 2){
                totalCost += (coursesEnrolled-2) * 6;
            }
            totalCost += 10;
        }

        else if(packageNumber == 2){
            if(coursesEnrolled > 4){
                totalCost += (coursesEnrolled-4) * 4;
            }
            totalCost += 12;
        }

        else{
            if(coursesEnrolled > 6){
                totalCost += (coursesEnrolled-6) * 3;
            }
            totalCost += 15;
        }

        System.out.println("Total cost is: " + totalCost);
    }
}

