package Lab;

public class Rectangle {
    double length;
    double breadth;

    Rectangle(double length, double breadth){
        this.length = length;
        this.breadth = breadth;
    }
    double area(){
        return length * breadth;
    }

    double perimeter(){
        return 2 * (length + breadth);
    }   

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(5.0, 3.0);
        System.out.println("Area: " + r1.area());
        System.out.println("Perimeter: " + r1.perimeter()); 
    }

}
