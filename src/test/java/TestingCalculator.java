import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void testAddition() {
        Calculator c = new Calculator(2, 3, '+');
        assertEquals(5, c.calculate());
    }

    @Test
    void testSubtraction() {
        Calculator c = new Calculator(5, 2, '-');
        assertEquals(3, c.calculate());
    }

    @Test
    void testMultiplication() {
        Calculator c = new Calculator(4, 3, '*');
        assertEquals(12, c.calculate());
    }

    @Test
    void testDivision() {
        Calculator c = new Calculator(10, 2, '/');
        assertEquals(5, c.calculate());
    }

    @Test
    void testDivisionByZero() {
        Calculator c = new Calculator(10, 0, '/');
        assertThrows(ArithmeticException.class, c::calculate);
    }

    @Test
    void testInvalidOperator() {
        Calculator c = new Calculator(1, 1, '%');
        assertThrows(IllegalArgumentException.class, c::calculate);
    }
}


