package net.wady;

public class Multiplication implements Operation {
    @Override
    public int operation(String... inputs) {
        int product = 1;
        for (String input : inputs) {
            product *= Integer.parseInt(input);
        }

        return product;
    }

    @Override
    public char getOperationSymbol() {
        return '*';
    }
}
