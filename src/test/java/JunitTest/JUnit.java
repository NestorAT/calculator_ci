package JunitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import calculator.Calculator;

public class JUnit {

    Calculator calculator;

    @BeforeEach
    void crearCalculadora() {
        calculator = new Calculator();
    }

    @Test
    @DisplayName("Suma de dos números positivos")
    void suma() {
        assertEquals(7, calculator.sum(3, 4));
    }

    @ParameterizedTest
    @CsvSource({"1, 2, 3", "-1, -2, -3", "0, 0, 0"})
    void sumaConVariosDatos(int a, int b, int esperado) {
        assertEquals(esperado, calculator.sum(a, b));
    }

    @ParameterizedTest
    @ValueSource(ints = {-3, 0, 5})
    void cuadradoNuncaNegativo(int numero) {
        assertTrue(calculator.square(numero) >= 0);
    }

    @Test
    void dividirEntreCeroLanzaExcepcion() {
        assertThrows(ArithmeticException.class, () -> calculator.divide(5, 0));
    }

    @RepeatedTest(3)
    void sumaRepetida() {
        assertEquals(10, calculator.sum(4, 6));
    }

    @Test
    @Timeout(1)
    void exponenteRapido() {
        assertEquals(8f, calculator.exponentia(2f, 3), 0.001);
    }

    @Test
    @Disabled("Pendiente: exponentes negativos")
    void exponenteNegativo() {
        assertEquals(0.125f, calculator.exponentia(2f, -3), 0.001);
    }
}
