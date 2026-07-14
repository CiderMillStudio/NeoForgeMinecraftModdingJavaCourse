package net.wady;

public class Addition implements Operation{

    @Override
    public int operation(String... inputs) {
        int sum = 0;
        for (String input : inputs) {
            sum += Integer.parseInt(input);
        }

        return sum;
    }

    @Override
    public char getOperationSymbol() {
        return '+';
    }
}
