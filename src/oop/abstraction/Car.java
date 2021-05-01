package oop.abstraction;

public abstract class Car {

    public void breaks() {
        System.out.println("Vehicle has to stop via this.");
    }

    public abstract void wheels();
}
