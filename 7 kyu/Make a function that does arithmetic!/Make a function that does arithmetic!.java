class ArithmeticFunction {
    public static int arithmetic(int a, int b, String operator) {
        return operator.equals("divide") ? a / b : operator.equals("multiply") ? a * b : a + (operator.equals("add") ? b : -b);
    }
}
