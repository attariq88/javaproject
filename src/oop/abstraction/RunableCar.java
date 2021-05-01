package oop.abstraction;

public class RunableCar extends Car implements Vehicle, Vehicle3 {
    @Override
    public void wheels() {
        System.out.println("Mercedes has four wheels");
    }

    @Override
    public void name() {
        System.out.println("Mercedes");
    }

    @Override
    public void start() {
        System.out.println("Engine starts");
    }

    @Override
    public void move() {
        System.out.println("Car is moving");
    }

    @Override
    public void stop() {
        System.out.println("Car stopped");
    }

    @Override
    public void honk() {
        System.out.println("Honking");
    }

    @Override
    public void steeringWheels() {

    }

    @Override
    public void tires() {

    }
}
