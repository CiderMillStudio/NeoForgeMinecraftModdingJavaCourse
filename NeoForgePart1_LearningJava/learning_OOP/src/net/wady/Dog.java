package net.wady;

public class Dog extends Animal implements Pettable, Walkable {
    // Members
    // Fields
    public static int numberOfDogs = 0;

    public Dog(String _picture, String _name, int _age) {
        super(_picture, _name, _age); // this is the same as saying 'new Animal'
        numberOfDogs++;
    }

    @Override
    public void pet() {
        System.out.println("tried to pet " + getName() + " and ...");
        bellyrub();
    }

    @Override
    public void walk() {
        System.out.println("took " + getName() + " for a walk!");
    }

    public void bellyrub(){
        System.out.println("you rubbed " + getName() + "'s belly :)");
    }
    @Override
    public void makeSound() {
        System.out.println(getName() + " woofed!");
    }

    @Override
    public void move() {
        System.out.println(getName() + " ran across the yard, tail wagging, tongue dangling.");
    }


}
