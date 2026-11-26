
package com.calculator.testing;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;
import calculator.Calculator;
import calculator.Calculator2;

public class CalculatorTest {
    Calculator calculator;

    @BeforeAll
    static void inicio() { System.out.println("Inicio de tests"); }

    @BeforeEach
    void crear() { calculator = new Calculator(); }

    @AfterEach
    void terminar() { calculator = null; }

    // Comprobar sumas con positivos y negativos
    @ParameterizedTest
    @CsvSource({"2,3,5", "-2,2,0", "-5,-5,-10"})
    void testSum(int a, int b, int r) {
        assertEquals(r, calculator.sum(a, b));
    }

    // Comprobar cuadrados con diferentes números
    @ParameterizedTest
    @ValueSource(ints = {2, -3, 0, 4})
    void testSquare(int n) {
        assertEquals(n * n, calculator.square(n));
    }

    @Test
    @DisplayName("Comprobar decimales y potencias")
    void testOtros() {
        assertEquals(6.25f, calculator.square(2.5f), 0.001f);
        assertEquals(8f, calculator.exponentia(2, 3));
    }

    // Comprobar división y excepción por cero
    @Test
    void testDivide() {
        assertEquals(5, calculator.divide(10, 2));
        assertThrows(ArithmeticException.class,
                () -> calculator.divide(10, 0));
    }

    // Comprobar desbordamiento y métodos estáticos
    @Test
    void testLimites() {
        assertEquals(Integer.MIN_VALUE,
                calculator.sum(Integer.MAX_VALUE, 1));
        assertEquals(10, Calculator2.sum(5, 5));
        assertEquals(25, Calculator2.square(5));
    }
}
