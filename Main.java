// Main class where we create and use objects
public class Main {
    public static void main(String[] args) {
        // Creating objects (instances) from the Car class
        Car car1 = new Car("Toyota", "Tacoma", 2020);
        Car car2 = new Car("Honda", "Accord", 2017);

        // Calling methods on the objects
        car1.displayInfo();  // Outputs: 2020 Toyota Tacoma
        car2.displayInfo();  // Outputs: 2017 Honda Accord
    }
}
