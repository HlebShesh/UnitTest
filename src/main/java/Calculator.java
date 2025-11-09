public class Calculator {
    private double a;
    private double b;
    private char operation;

    public Calculator(double a, double b, char operation) {
        this.a = a;
        this.b = b;
        this.operation = operation;
    }

    public double calculate() {
        return switch (operation) {
            case '+' -> a + b;
            case '-' -> a - b;
            case '*' -> a * b;
            case '/' -> {
                if (b == 0) throw new ArithmeticException("Division by zero");
                yield a / b;
            }
            default -> throw new IllegalArgumentException("Invalid operator");
        };
    }
}


