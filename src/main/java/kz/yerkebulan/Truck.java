package kz.yerkebulan;

public class Truck extends Vehicle {
    private double capacity;
    private int numAxles;

    public Truck(String brand, int year, double capacity, int numAxles) {
        super(brand, year);
        this.capacity = capacity;
        this.numAxles = numAxles;
    }

    @Override
    void startEngine() {
        System.out.println("Truck engine started.");
    }

    @Override
    void stopEngine() {
        System.out.println("Truck engine stopped.");
    }
}
