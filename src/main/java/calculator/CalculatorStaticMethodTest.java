package calculator;

import org.junit.jupiter.api.Test;

public class CalculatorStaticMethodTest {
	
    @Test
    public void testDoNothing() {
        Calculator2.doNothing();
    }

    @Test
    public void testSumInt() {
        assertEquals(5, Calculator2.sum(2, 3));
    }

    @Test
    public void testSumDouble() {
        assertEquals(5.5, Calculator2.sum(2.5, 3.0));
    }

    private void assertEquals(double d, double sum) {
		// TODO Auto-generated method stub
		
	}

	@Test
    public void testSquareInt() {
        assertEquals(25, Calculator2.square(5));
    }

    @Test
    public void testSquareFloat() {
        assertEquals(25.0f, Calculator2.square(5.0f));
    }

    @Test
    public void testExponentia() {
        assertEquals(8.0f, Calculator2.exponentia(2.0f, 3));
        
        
    }
}


