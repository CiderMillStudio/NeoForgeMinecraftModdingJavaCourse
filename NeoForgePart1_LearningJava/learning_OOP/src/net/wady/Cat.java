package net.wady;

public class Cat extends Animal {



    public Cat(String _picture, String _name, int _age) {
        super(_picture, _name, _age);

    }

    @Override
    public void makeSound() {
        System.out.println(this.getName() + " meowed!");
    }

    public void scratch() {
        System.out.println("You've been scratched by " + getName());
    }
}
