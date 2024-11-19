import java.util.Scanner;

class Vehicle {
    String brand;
    int wheels;
    double speed;

    // Constructor to initialize common vehicle properties
    Vehicle(String brand, int wheels, double speed) {
        this.brand = brand;
        this.wheels = wheels;
        this.speed = speed;
    }

    // Method to display vehicle details
    void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Number of Wheels: " + wheels);
        System.out.println("Speed: " + speed + " km/h");
    }
}

class Car extends Vehicle {
    int doors;

    // Constructor to initialize car-specific properties
    Car(String brand, double speed, int doors) {
        super(brand, 4, speed); // Calls the Vehicle constructor
        this.doors = doors;
    }

    // Method to display car details
    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Number of Doors: " + doors);
        System.out.println("Vehicle Type: Car");
    }
}

class Bike extends Vehicle {
    boolean hasCarrier;

    // Constructor to initialize bike-specific properties
    Bike(String brand, double speed, boolean hasCarrier) {
        super(brand, 2, speed); // Calls the Vehicle constructor
        this.hasCarrier = hasCarrier;
    }

    // Method to display bike details
    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Has Carrier: " + (hasCarrier ? "Yes" : "No"));
        System.out.println("Vehicle Type: Bike");
    }
}

public class Exp3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Getting input for Car details
        System.out.println("Enter Car Details:");
        System.out.print("Brand: ");
        String carBrand = scanner.nextLine();
        System.out.print("Speed (in km/h): ");
        double carSpeed = scanner.nextDouble();
        System.out.print("Number of Doors: ");
        int carDoors = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        Car myCar = new Car(carBrand, carSpeed, carDoors);
        System.out.println("\nCar Details:");
        myCar.displayInfo();

        System.out.println();

        // Getting input for Bike details
        System.out.println("Enter Bike Details:");
        System.out.print("Brand: ");
        String bikeBrand = scanner.nextLine();
        System.out.print("Speed (in km/h): ");
        double bikeSpeed = scanner.nextDouble();
        System.out.print("Does the bike have a carrier? (true/false): ");
        boolean bikeHasCarrier = scanner.nextBoolean();

        Bike myBike = new Bike(bikeBrand, bikeSpeed, bikeHasCarrier);
        System.out.println("\nBike Details:");
        myBike.displayInfo();

        scanner.close();
    }
}
