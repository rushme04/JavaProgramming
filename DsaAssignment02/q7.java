package DsaAssignment02;
import java.util.Scanner;

class shapes {

    String colour;

    shapes(String c) {
        this.colour = c;
    }
}

class circles extends shapes {

    double radius;

    circles(String c, double r) {
        super(c);
        this.radius = r;
    }

    double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    void display() {
        System.out.println("Colour : " + this.colour);
        System.out.println("Area : " + calculateArea(this.radius));
    }
}

class Rectangles extends shapes {

    double length;
    double width;

    Rectangles(String c, double l, double w) {
        super(c);
        this.length = l;
        this.width = w;
    }

    double calculateArea() {
        return length * width;
    }

    void display() {
        System.out.println("Colour : " + this.colour);
        System.out.println("Area : " + calculateArea());
    }
}

public class q7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius of circle: ");
        double radius = sc.nextDouble();
        System.out.print("Enter colour of circle: ");
        String colour = sc.next();
        circles c = new circles(colour, radius);
        c.display();

        System.out.print("Enter length and width of rectangle: ");
        double length = sc.nextDouble();
        double width = sc.nextDouble();
        System.out.print("Enter colour of rectangle: ");
        String colourr = sc.next();
        Rectangles r = new Rectangles(colourr, length, width);
        r.display();

    }
}

