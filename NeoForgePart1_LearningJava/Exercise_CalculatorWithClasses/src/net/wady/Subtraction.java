package net.wady;

public class Subtraction implements Operation{
    @Override
    public int operation(String... inputs) {
        int diff = Integer.parseInt(inputs[0]);
        for (int i = 1; i < inputs.length; i++) {
            diff -= Integer.parseInt(inputs[i]);
        }

        return diff;
    }

    @Override
    public char getOperationSymbol() {
        return '-';
    }
}
