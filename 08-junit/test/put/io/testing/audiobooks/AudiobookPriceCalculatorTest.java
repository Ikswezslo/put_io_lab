package put.io.testing.audiobooks;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

// Pytanie 5.1: jest to testowanie typu whitebox
// Pytanie 5.2: istnieją 4 możliwe ścieżki działania

class AudiobookPriceCalculatorTest {
    private Audiobook audiobook;
    private AudiobookPriceCalculator calculator;
    @BeforeEach
    void setUp() {
        audiobook =  new Audiobook("test", 100);
        calculator = new AudiobookPriceCalculator();
    }

    @Test
    void calculateStandard() {
        Customer customer = new Customer("Marian", Customer.LoyaltyLevel.STANDARD, false);
        assertEquals(100, calculator.calculate(customer, audiobook));
    }

    @Test
    void calculateSilver() {
        Customer customer = new Customer("Marian", Customer.LoyaltyLevel.SILVER, false);
        assertEquals(90, calculator.calculate(customer, audiobook));
    }

    @Test
    void calculateGold() {
        Customer customer = new Customer("Marian", Customer.LoyaltyLevel.GOLD, false);
        assertEquals(80, calculator.calculate(customer, audiobook));
    }

    @Test
    void calculateSubscriber() {
        Customer customer = new Customer("Marian", Customer.LoyaltyLevel.STANDARD, true);
        assertEquals(0, calculator.calculate(customer, audiobook));
    }
}
