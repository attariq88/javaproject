package oop.abstraction;

public class Tesla extends RunableCar {
    public static void main(String[] args) {
        Tesla tesla = new Tesla();
        tesla.name();
        tesla.start();
        tesla.stop();


    }

    @Override
    public void stop() {
        System.out.println("Tesla never stop.");
    }

}
