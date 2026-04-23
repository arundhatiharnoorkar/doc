public class Grade {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return a / b;
    }

    public static void main(String[] args) {
        Grade calc = new Grade();

        System.out.println(calc.add(10, 5));
        System.out.println(calc.subtract(10, 5));
        System.out.println(calc.multiply(10, 5));
        System.out.println(calc.divide(10, 5));
    }
}
