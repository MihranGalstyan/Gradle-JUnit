import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Mihran Galstyan
 * All rights reserved
 */
class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    void add() {
        int expected = 15;
        int result = calculator.add(10, 5);
        assertEquals(expected, result);

        int expected2 = -18;
        int result2 = calculator.add(-24, 6);
        assertEquals(expected2, result2);

        int expected3 = -73;
        int result3 = calculator.add(127, -9);
        assertNotEquals(expected3, result3);
    }

    @Test
    void subtract() {
        int expected = 5;
        int result = calculator.subtract(10, 5);
        assertEquals(expected, result);

        int expected2 = -30;
        int result2 = calculator.subtract(-24, 6);
        assertEquals(expected2, result2);

        int expected3 = 118;
        int result3 = calculator.subtract(127, -9);
        assertNotEquals(expected3, result3);
    }

    @Test
    void multiply() {
        double expected = 50.0;
        double result = calculator.multiply(10, 5);
        assertEquals(expected, result, 0.001);

        double expected2 = -144.0;
        double result2 = calculator.multiply(-24, 6);
        assertEquals(expected2, result2, 0.001);

        double expected3 = 170.0;
        double result3 = calculator.multiply(17, -10);
        assertNotEquals(expected3, result3, 0.001);
    }

    @Test
    void divide() {
        double expected = 2.0;
        double result = calculator.divide(10, 5);
        assertEquals(expected, result, 0.001);

        double expected2 = -4.0;
        double result2 = calculator.divide(-24, 6);
        assertEquals(expected2, result2, 0.001);

        double expected3 = 170.0;
        double result3 = calculator.divide(17, -10);
        assertNotEquals(expected3, result3, 0.001);
    }

    @Test
    void square() {
        int expected = 100;
        int result = calculator.square(10);
        assertEquals(expected, result);

        int expected2 = 36;
        int result2 = calculator.square(-6);
        assertEquals(expected2, result2);

        int expected3 = -1;
        int result3 = calculator.square(0);
        assertNotEquals(expected3, result3);
    }
}