package put.io.testing.junit;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private static Calculator calculator;

    @BeforeAll
    // Pytanie 3.1
    // BeforeEach jest wywoływany przed każdym testem
    // BeforeAll jest wywoływany raz przed wszystkimi testami
    // Aby BeforeAll działał funkcja setUp musi być statyczna
    static void setUp() {
        calculator = new Calculator();
    }

    @Test
    void add() {
        assertEquals(5, calculator.add(3, 2));
        assertEquals(-1, calculator.add(-3, 2));
    }

    @Test
    void multiply() {
        assertEquals(6, calculator.multiply(3, 2));
        assertEquals(0, calculator.multiply(6, 0));
    }

    @Test
    void addPositiveNumbers() {
        assertThrows(IllegalArgumentException.class, () -> {calculator.addPositiveNumbers(-5, 2);});
    }
}