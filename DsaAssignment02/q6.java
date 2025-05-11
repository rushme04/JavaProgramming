package DsaAssignment02;

class Vehicle {

    String model;
    int year;

    Vehicle(String model, int year) {
        this.model = model;
        this.year = year;
    }
}

class Cars extends Vehicle {

    int carId;
    double price;

    Cars(String model, int year, int carId, double price) {
        super(model, year);
        this.carId = carId;
        this.price = price;
    }

    void display() {

        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Car ID: " + carId);
        System.out.println("Price: $" + price);
    }
}

public class q6 {

    public static void main(String[] args) {
        Cars car1 = new Cars("TATA", 2025, 101, 120000);
        System.out.println("Car Details:");
        car1.display();
    }
}
