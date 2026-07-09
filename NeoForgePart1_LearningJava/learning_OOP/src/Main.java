import net.wady.Dog;

public class Main {
    public static void main(String[] args) {
        /* CLASSES AND OBJECTS */
        Dog bengie = new Dog("bengie.png", "bengie", 11);
        Dog jeremy = new Dog("jeremy.jpg", "Jeremy", 7);

        System.out.println("Bengie age: " + bengie.age);
        System.out.println("Jeremy age: " + jeremy.age);

        jeremy.birthday();

        jeremy.bark();

        bengie.bark();

        System.out.println("Bengie age: " + bengie.age);
        System.out.println("Jeremy age: " + jeremy.age);

        bengie.age = 100; // yes, you can modify fields from any class, but ideally we don't want to be doing this.
                            // We can control for this via access modifiers.


    }
}
