import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class Number {
    private static final Map<String, BiFunction<Number, Number, Number>> operators = new HashMap<>();

    static {
        operators.put("+", (a, b) -> new Number(a.no + b.no));
        operators.put("-", (a, b) -> new Number(a.no - b.no));
        operators.put("*", (a, b) -> new Number(a.no * b.no));
        operators.put("/", (a, b) -> {
            if (b.no == 0) {
                throw new ArithmeticException("Can not divide by zero");
            }
            return new Number(a.no / b.no);
        });
    }

    private int no;

    public Number(int no) {
        this.no = no;
    }

    @Override
    public String toString() {
        return "Number{" +
                "no=" + no +
                '}';
    }

    public Number calculate(NumberOperator opr, Number number) {
        BiFunction<Number, Number, Number> operator = operators.get(opr.getExpression());
        if (operator == null) {
            throw new IllegalArgumentException();
        }

        return operator.apply(this, number);
    }
}
