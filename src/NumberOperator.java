public enum NumberOperator {
    ADDITION("+"),
    MINUS("-"),
    MULTIPLICATION("*"),
    DIVISION("/"),
    ;

    private String expression;

    NumberOperator(String opr) {
        this.expression = opr;
    }

    public String getExpression() {
        return expression;
    }
}
