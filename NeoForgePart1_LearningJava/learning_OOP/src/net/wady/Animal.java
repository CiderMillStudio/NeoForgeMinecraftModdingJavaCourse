package net.wady;

public abstract class Animal { // An ABSTRACT CLASS CANNOT BE INSTANTIATED, instead, it's subclass must be instantiated.

    protected String picture;
    private String name;
    private int age;

    public abstract void makeSound(); // by making a METHOD ABSTRACT, you force subclasses to implement it.
    public abstract void move();

    public Animal(String _picture, String _name, int _age) {
        this.picture = _picture;
        this.name = _name;
        this.age = _age;
    }

    public void birthday() {
        age++;
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
