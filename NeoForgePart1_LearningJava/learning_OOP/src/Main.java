import com.sun.source.tree.CaseTree;
import net.wady.*;

public class Main {
    public static void main(String[] args) {
        /* CLASSES AND OBJECTS */

        // System.out.println("In the beginning, there are " + Dog.numberOfDogs + " dogs.");
        Dog bengie = new Dog("bengie.png", "bengie", 11);
        // System.out.println("Now, there are " + Dog.numberOfDogs + " dogs.");
        Dog jeremy = new Dog("jeremy.jpg", "Jeremy", 7);
        // System.out.println("Now, there are " + Dog.numberOfDogs + " dogs.");
        Dog casper = new Dog("casper.png", "casper", 4);
        Cat syoma = new Cat("syoma.png", "Syoma", 6);
        Bear newton = new Bear("newton.jpeg", "Newton", 8);
        Bird birdy = new Bird("birdy.jpeg", "Birdy", 4);


        System.out.println("\nWELCOME TO PETTING ZOO!");

        PettingZoo pettingZoo = new PettingZoo(syoma, casper, bengie, jeremy);
        pettingZoo.petRandomAnimal();
        pettingZoo.petRandomAnimal();
        pettingZoo.petRandomAnimal();

        bengie.birthday();
        bengie.makeSound();
        bengie.displayInfo();

        syoma.birthday();
        syoma.makeSound();
        syoma.displayInfo();

        // this is nuts, you can declare an object of a super-class type,
        // and POLYMORPHISM allows you to take that super-object and use it as
        // any of its subclass!
        Animal myCuteAnimal;
        myCuteAnimal = new Dog("Paco.png", "Paco", 12);
        myCuteAnimal.makeSound();

        // you need to cast it in order to make it do subclass-exclusive methods
        // myCuteAnimal.bellyrub() doesn't work.. you've got to cast as Dog
        ((Dog) myCuteAnimal).bellyrub();



        syoma.pet();
        casper.pet();
        casper.walk();
        newton.makeSound();
        birdy.makeSound();
        birdy.move();





/*        System.out.println("Bengie age: " + bengie.getAge());
        System.out.println("Jeremy age: " + jeremy.getAge());

        jeremy.birthday();

        jeremy.bark();

        bengie.bark();

        System.out.println("Bengie age: " + bengie.getAge());
        System.out.println("Jeremy age: " + jeremy.getAge());


        casper.bark();

        System.out.println("Now, there are " + Dog.numberOfDogs + " dogs.");*/


        //bengie.age = 100; // yes, you can modify fields from any class, but ideally we don't want to be doing this.
                            // We can control for this via access modifiers.


    }
}
