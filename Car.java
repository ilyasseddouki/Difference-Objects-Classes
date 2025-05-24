public class Car {
    // properties of a car
    String make;
    String model;
    int year;

    // Constructor to initialize the car object
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Method to display car info
    public void displayInfo() {
        System.out.println(year + " " + make + " " + model);
    }
}
