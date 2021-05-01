package oop.abstraction;

public class CarExecution {
    public static void main(String[] args) {
        RunableCar mercedes = new RunableCar();
        mercedes.name();
        mercedes.start();
        mercedes.move();
        mercedes.honk();
        mercedes.breaks();
        mercedes.stop();
    }
}
