package oop.encapsulation;

public class Institute {
    public static void main(String[] args) {
        Students tariq = new Students();
        tariq.setName("Tariq");
        tariq.setId(123);
        tariq.setLocation("Dhaka");
        tariq.setAge(32);

        System.out.println(tariq.toString());
        // System.out.println(tariq.getId());

    }
}
