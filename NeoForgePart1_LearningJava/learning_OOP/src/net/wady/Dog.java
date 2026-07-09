package net.wady;

public class Dog {
    // Members
    // Fields
    public String picture;
    protected String dogName;
    private int age;
    public static int numberOfDogs = 0;

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
        numberOfDogs++;
    }

    public void birthday() {
        age++;
    }

    public void bark() {
        System.out.println(dogName + " barked!");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int _newAge) {
        age = _newAge;
    }

}
