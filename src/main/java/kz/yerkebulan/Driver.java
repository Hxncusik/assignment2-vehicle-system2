package kz.yerkebulan;

import java.util.ArrayList;
import java.util.List;

public class Driver {
    private String name;
    private String licenseNumber;
    private List<Vehicle> vehicles;

    public Driver(String name, String licenseNumber) {
        this.name = name;
        this.licenseNumber = licenseNumber;
        this.vehicles = new ArrayList<>();
    }

    public void displayDriverInfo() {
        System.out.println("Driver information:");
        System.out.println("Name: " + name + " licenseNumber: " + licenseNumber);
    }
}
