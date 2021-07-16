package stream;

import java.util.function.DoubleBinaryOperator;

public enum Operation {

    PLUS("+", (x, y) -> x + y),
    MINUS("-", (x, y) -> x - y),
    TIMES("*", (x, y) -> x * y),
    DIVIDE("/", (x, y) -> x / y);

    private final String symbol;
    private final DoubleBinaryOperator doubleBinaryOperator;

    Operation(String symbol, DoubleBinaryOperator doubleBinaryOperator) {
        this.symbol = symbol;
        this.doubleBinaryOperator = doubleBinaryOperator;
    }

    public double apply(double x, double y) {
        return doubleBinaryOperator.applyAsDouble(x ,y);
    }
}
