package fp.Calculator_ci;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    private Calculator calculator = new Calculator();

    @Test
    public void testSquare() {
        System.out.println("Square algorithm test");

        assertEquals(25, calculator.square(5));
    }
}