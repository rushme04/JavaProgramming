package DsaAssignment02;
import java.util.Scanner;

 class PointType {
    public double x,y;
    public PointType(){
        this.x = 0;
        this.y = 0;
    }
     PointType(double x, double y) {
        this.x = x;
        this.y = y;
    }

     double getX(){
        return x;
}
     double getY(){
        return y;
}
     void printPoint() {
        System.out.println("Point Coordinates: (" + x + ", " + y + ")");
    }
}

class CircleType extends PointType{
     double radius;
     
    CircleType(double x, double y, double radius) {
    super(x, y);
    this.radius = radius;
}

     double getR(){
        return radius;
    }
    
     double getArea() {
        return Math.PI * radius * radius;
    }

    
     double getCircumference() {
        return 2 * Math.PI * radius;
    }

     void printCircle() {
        System.out.println("Circle Details:");
        printPoint(); 
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + getArea());
        System.out.println("Circumference: " + getCircumference());
    }}
    public class q15{
    public static void main(String[] args) {
Scanner sc =  new Scanner(System.in);
        System.out.println("enter x coordinate");
        double x = sc.nextDouble();
        System.out.println("enter y coordinate");
        double y = sc.nextDouble();
        System.out.print("Enter Radius of the Circle: ");
        double radius = sc.nextDouble();

        CircleType c =  new CircleType(x,y,radius);
        c.printCircle();

    }
}
