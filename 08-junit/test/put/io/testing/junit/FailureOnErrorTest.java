package put.io.testing.junit;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FailureOnErrorTest {

    @Test
    void test1() { // Pytanie 4.1: Oznaczona jako Failure
        assertEquals(1, 2);
    }

    @Test
    void test2() { // Pytanie 4.1: Oznaczona jako Error
        throw new IllegalArgumentException();
    }

    @Test
    void test3() {
        try {
            assertEquals(3, 2);
        }
        catch (Error e) { // Pytanie 4.2: AssertionFailedError
            e.printStackTrace();
        }
    }
}
