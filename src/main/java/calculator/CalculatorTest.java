package calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    private Calculator calculator = new Calculator();

    @Test
    public void testSquare() {

        System.out.println("Square algorithm test");

        assertEquals(25, calculator.square(5));
    }
}
