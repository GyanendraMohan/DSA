package Lab;

public class Box {
    double length;
    double breadth;
    double height;

    Box(){
        length = 1.0;
        breadth = 1.0;
        height = 1.0;
    }

    Box(double side){
        length = side;
        breadth = side;
        height = side;
    }
    Box(double length, double breadth, double height){
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    double volume(){
        return length * breadth * height;
    }

    void display() {
        System.out.println("Volume: " + volume());
    }

    public static void main(String[] args) {
        Box b1 = new Box();
        b1.display();

        Box b2 = new Box(2.0);
        b2.display();

        Box b3 = new Box(2.0, 3.0, 4.0);
        b3.display();
    }
}
