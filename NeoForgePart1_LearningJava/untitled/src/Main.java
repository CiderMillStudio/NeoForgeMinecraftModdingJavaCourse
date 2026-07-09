import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.printf("Hello and welcome!");

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        String x = "hi";
        String y = "Hi";

        if (x.equalsIgnoreCase(y)) {
            System.out.println("YAY");
        }
    }
}
