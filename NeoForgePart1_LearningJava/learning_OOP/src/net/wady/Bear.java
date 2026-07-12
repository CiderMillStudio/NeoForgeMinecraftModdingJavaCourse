package net.wady;

public class Bear extends Animal {

    public Bear(String _picture, String _name, int _age) {
        super(_picture, _name, _age);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " roared a mighty roar!");
    }

    @Override
    public void move() {
        System.out.println(getName() + " lumbered about on it's mighty paws through the forest.");
    }
}
