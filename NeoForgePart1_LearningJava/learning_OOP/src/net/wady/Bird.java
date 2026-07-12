package net.wady;

public class Bird extends Animal {

    public Bird(String _picture, String _name, int _age) {
        super(_picture, _name, _age);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " squawked!");
    }

    @Override
    public void move() {
        System.out.println(getName() + " flew away!");
    }
}
