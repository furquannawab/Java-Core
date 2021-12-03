package classes;

import files.Circle;

public class CircleDemo {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println("Radius is " + circle.getRadius());
        System.out.println("Circumference is " + circle.circumference());
        System.out.println("Area is " + circle.area());
    }
}
