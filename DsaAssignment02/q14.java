package DsaAssignment02;
import java.util.*;

class Distance {

    int feet;
    int inches;

    Distance(int feet, int inches) {
        this.feet = feet;
        this.inches = inches;
    }

    void displayDistance() {
        System.out.println(feet + "' " + inches + "\"");
    }
}

class Measurement extends Distance {

    double centimetres;

    public Measurement(int feet, int inches, double centimetres) {
        super(feet, inches);
        this.centimetres = centimetres;
    }

    void displayMeasurement() {
        super.displayDistance();
        System.out.println("Centimetres: " + centimetres);
    }
}

public class q14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter feet: ");
        int feet = sc.nextInt();

        System.out.print("Enter inches: ");
        int inches = sc.nextInt();

        System.out.print("Enter centimetres: ");
        double centimetres = sc.nextDouble();

        Measurement measure = new Measurement(feet, inches, centimetres);
        measure.displayMeasurement();
    }
}

