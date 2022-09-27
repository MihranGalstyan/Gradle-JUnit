/**
 * Created by Mihran Galstyan
 * All rights reserved
 */
public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public double multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            throw new ArithmeticException();
        }
    }

    public int square(int a) {
        return a * a;
    }
}
