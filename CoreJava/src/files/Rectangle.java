package files;

public class Rectangle {
    private int length;
    private int breadth;

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }

    public Rectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    public int perimeter(){
        return 2*(length+breadth);
    }

    public int area(){
        return length*breadth;
    }
}
