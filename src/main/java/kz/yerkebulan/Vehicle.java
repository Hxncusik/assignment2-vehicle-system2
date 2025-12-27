package kz.yerkebulan;

public abstract class Vehicle {
    protected String brand;
    protected int year;

    protected Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    abstract void startEngine();
    abstract void stopEngine();

    void displayInfo() {
        System.out.println("Vehicle Information:");
        System.out.println("Brand: " + brand + ", Year: " + year);
    }
}
