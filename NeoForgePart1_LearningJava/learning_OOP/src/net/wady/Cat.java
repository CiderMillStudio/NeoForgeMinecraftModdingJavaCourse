package net.wady;

public class Cat extends Animal implements Pettable {

    public Cat(String _picture, String _name, int _age) {
        super(_picture, _name, _age);

    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " meowed!");
    }

    @Override
    public void move() {
        System.out.println(getName() + " delicately pranced away.");
    }


    public void scratch() {
        System.out.println("You've been scratched by " + getName());
    }

    @Override
    public void pet() {
        System.out.println("tried to pet " + getName() + "... but");
        scratch();
    }
}
