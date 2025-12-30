# Assignment 2 — Vehicle Management System  
**Object-Oriented Programming: Inheritance & Abstraction**

## Project Overview

This project is a **Vehicle Management System** created to demonstrate core **Object-Oriented Programming (OOP)** concepts in Java
- **Inheritance**
- **Abstraction**
- **Composition**
- **Aggregation**
- **Method overriding**
- **Constructor chaining using `super`**

The system models different types of vehicles (`Car`, `Motorcycle`, `Truck`) derived from a common abstract superclass (`Vehicle`) and associates them with `Driver` objects.  
The main program works with an array of abstract `Vehicle` references, showcasing polymorphism.

---

## OOP Concepts Used
- Abstraction — `Vehicle` is an abstract class defining common behavior
- Inheritance — concrete vehicle types extend `Vehicle`
- Method Overriding — each vehicle provides its own engine behavior
- Composition — each vehicle has a `Driver`
- Aggregation — one `Driver` can be shared across multiple vehicles
- Encapsulation — fields use `private` and `protected` access modifiers

---

## Class Hierarchy

```
Vehicle (abstract)
├── Car
├── Motorcycle
└── Truck
````

### Vehicle (Abstract Superclass)
Fields
- `brand` (String)
- `year` (int)

Methods
- `startEngine()` (abstract)
- `stopEngine()` (abstract)
- `displayInfo()` (concrete)

Purpose**
Defines shared properties and behavior for all vehicles while enforcing implementation of engine logic in subclasses.


### Car (Subclass)
Additional Fields
- `doors` (int)
- `fuelType` (String)

Overrides
- `startEngine()`
- `stopEngine()`


### Motorcycle (Subclass)
Additional Field
- `hasSidecar` (boolean)

Overrides
- `startEngine()`
- `stopEngine()`

### Truck (Subclass)
Additional Fields
- `capacity` (double)
- `numAxles` (int)

Overrides
- `startEngine()`
- `stopEngine()`

### Driver
Fields
- `name` (String)
- `licenseNumber` (String)

Methods
- `displayDriverInfo()`

Associations
- Each `Vehicle` has a Driver (composition)
- A `Driver` can be associated with multiple Vehicles (aggregation)

## Main Program Logic (`Main.java`)

The `main()` method performs the following:
1. Creates instances of `Car`, `Motorcycle`, and `Truck`
2. Creates one or more `Driver` objects
3. Assigns drivers to vehicles
4. Stores all vehicles in a `Vehicle[]` array
5. Iterates over the array and:
   - Starts the engine
   - Displays vehicle information
   - Stops the engine
6. Displays driver information

This demonstrates polymorphism by treating all vehicle types uniformly via the abstract `Vehicle` reference.

---

## Compilation & Execution

### Compile all source files
```bash
javac *.java
````

### Run the program

```bash
java Main
```

## 📸 Screenshots

Screenshots of program output demonstrating correct behavior are available here:
```
docs/screenshots/output.png
```

They include:

- Engine start/stop messages for different vehicles
- Vehicle information output
- Driver information display

## Reflection

Inheritance significantly simplified the design of this system by allowing all vehicles to share common properties such as brand and year through the abstract `Vehicle` class. This eliminated code duplication and made the system easier to extend. Adding new vehicle types would only require creating a new subclass and overriding the abstract methods.
Method overriding allowed each vehicle type to define its own engine behavior while still conforming to the same interface. One challenge encountered was choosing between `protected` and default access modifiers. Using `protected` fields allowed subclasses to access shared data while maintaining encapsulation, but required careful design to avoid exposing internal state unnecessarily.

## Repository Structure

```
assignment2-vehicle-system/
├── src/
│   ├── Vehicle.java
│   ├── Car.java
│   ├── Motorcycle.java
│   ├── Truck.java
│   ├── Driver.java
│   └── Main.java
├── docs/
│   ├── screenshots/
│   └── uml-diagram.png
├── README.md
└── .gitignore
```

## Git Branch Strategy
- `main` — stable release
- `feature/vehicle` — Vehicle superclass and subclasses
- `feature/driver` — Driver class and associations
- `feature/main` — Main program and vehicle array logic
- `feature/docs` — README, screenshots, UML diagram

## Testing & Validation
- Each subclass tested independently
- Verified method overriding behavior
- Confirmed constructor chaining with `super`
- Validated Driver–Vehicle associations
- Ensured mixed vehicle types work correctly in arrays

## Deliverables
- All required `.java` source files
- Complete `README.md`
- Screenshots of program output
- Clean and meaningful Git commit history