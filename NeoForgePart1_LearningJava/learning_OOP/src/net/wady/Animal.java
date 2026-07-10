package net.wady;

public class Animal {

    protected String picture;
    private String name;
    private int age;

    public Animal(String _picture, String _name, int _age) {
        this.picture = _picture;
        this.name = _name;
        this.age = _age;
    }

    public void birthday() {
        age++;
    }

    public void makeSound() {
        System.out.println(name + " made a sound!");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int _newAge) {
        age = _newAge;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age + " years");
        System.out.println("Picture: " + picture);
    }

    public String getName() {
        return name;
    }
}
