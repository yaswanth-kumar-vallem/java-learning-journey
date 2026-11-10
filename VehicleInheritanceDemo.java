package unif;

class Vehicle {
    String vehicleNumber;
    String brand;

    void displayVehicle() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Brand: " + brand);
    }
}

class Bus extends Vehicle {
    int seats;

    void displayBus() {
        System.out.println("No. of seats: " + seats);
    }
}

class Car extends Vehicle {
    String fuelType;

    void displayCar() {
        System.out.println("Fuel Type: " + fuelType);
    }
}

public class VehicleInheritanceDemo {
    public static void main(String[] args) {
        Car myCar = new Car();

        myCar.vehicleNumber = "TS08AB1234";
        myCar.brand = "Toyota";
        myCar.fuelType = "Petrol";

        myCar.displayVehicle();
        myCar.displayCar();
    }
}