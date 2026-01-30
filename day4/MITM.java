// Car class
class Car {
    String color;
    int speed;

    // Method to print car info
    void run() {
        System.out.println("Car color: " + color);
        System.out.println("Car speed: " + speed);
    }
}

// Main class
public class MITM {
    public static void main(String[] args) {
        Car rr = new Car();  // create object
        rr.color = "White";
        rr.speed = 100;
        rr.run();           // call method
    }
}
