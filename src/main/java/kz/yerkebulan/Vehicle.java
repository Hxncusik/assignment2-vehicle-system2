package kz.yerkebulan;

public abstract class Vehicle {
    protected Driver driver;
    protected String brand;
    protected int year;

    protected Vehicle(String brand, int year, Driver driver) {
        this.brand = brand;
        this.year = year;
        this.driver = driver;
    }

    abstract void startEngine();

    abstract void stopEngine();

    void displayInfo() {
        System.out.println("Vehicle Information:");
        System.out.println("Brand: " + brand + ", Year: " + year);
    }
}
