package net.wady;

public class Division implements Operation {

    int remainder = 0;
    boolean dividedByZero = false;

    @Override
    public int operation(String... inputs) {

        if (Integer.parseInt(inputs[1]) == 0) {
            dividedByZero = true;
            System.out.println("FAILURE... CANNOT DIVIDE BY 0");
            return 0;
        }

        float quotient = Integer.parseInt(inputs[0]);
        remainder = Integer.parseInt(inputs[0]) % Integer.parseInt(inputs[1]);
        for (int i = 1; i < inputs.length; i++) {
            quotient /= Integer.parseInt(inputs[i]);
        }

        return ((int) quotient);
    }

    @Override
    public char getOperationSymbol() {
        return '/';
    }

    public void reportRemainder() {
        if (dividedByZero == false) { System.out.println("Remainder is: " + remainder); } ;
    }


}
