package kz.yerkebulan;

public class Main {
    public static void main(String[] args) {
        // Creating driver and vehicle objects
        Driver john = new Driver("John", "123456789");
        Driver jane = new Driver("Jane", "987654321");
        Driver mary = new Driver("Mary", "098765432");

        Car car = new Car("BMW", 2019, 4, "Petrol", john);
        Motorcycle motorcycle = new Motorcycle("Honda", 2018, true, jane);
        Truck truck = new Truck("Ford", 2017, 1000, 4, mary);

        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = car;
        vehicles[1] = motorcycle;
        vehicles[2] = truck;

        // Displaying vehicle information
        for (Vehicle vehicle : vehicles) {
            vehicle.startEngine();
            vehicle.displayInfo();
            vehicle.stopEngine();
        }

        // Displaying driver information
        john.displayDriverInfo();
        jane.displayDriverInfo();
        mary.displayDriverInfo();
    }
}