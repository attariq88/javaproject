package oop.encapsulation;

public class Students {

    private String name;
    private int id;
    private String location;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", location='" + location + '\'' +
                ", age=" + age +
                '}';
    }
}
