package net.wady;

public class Dog extends Animal {
    // Members
    // Fields
    public static int numberOfDogs = 0;

    public Dog(String _picture, String _name, int _age) {
        super(_picture, _name, _age); // this is the same as saying 'new Animal'
        numberOfDogs++;
    }

    @Override
    public void makeSound() {
        System.out.println(this.getName() + " barked!");
    }

    public void bellyrub(){
        System.out.println("you rubbed " + getName() + "'s belly :)");
    }
}
