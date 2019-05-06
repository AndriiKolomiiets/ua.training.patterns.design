package patterns.creational.prototype.model;

public class Human implements Copyable {
    private int age;
    private String name;
    private String address;

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Human(int age, String name, String address) {
        this.age = age;
        this.name = name;
        this.address = address;
    }

    @Override
    public Object copy() {
        return new Human(age, name, address);
    }

    @Override
    public String toString() {
        return "Person with name: " + name
                + "\nAge: " + age
                + "\nAddress: " + address;
    }
}
