package net.wady;

public class Dog {
    // Members
    // Fields
    public String picture;
    public String dogName;
    public int age;

    // Constructors --> "Method" used to create a new instance of a class
    // This is the default constructor:
    /*
    public Dog() {

    }
    */

    public Dog(String _picture, String _name, int _age) {
        this.picture = _picture;
        this.dogName = _name;
        this.age = _age;
    }

    public void birthday() {
        age++;
    }

    public void bark() {
        System.out.println(dogName + " barked!");
    }

}
