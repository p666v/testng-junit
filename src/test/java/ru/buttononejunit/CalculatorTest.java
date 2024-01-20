package ru.buttononejunit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.buttonone.calculator.Calculator;
import ru.buttonone.calculator.CalculatorImpl;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class CalculatorTest {

    Calculator calculator = new CalculatorImpl();

    @DisplayName("Должен корректно суммировать значения")
    @Test
    public void shouldHaveCorrectSum(){
        int result = calculator.sum(3, 5);
        assertEquals(8, result);
    }

    @DisplayName("Должен корректно выполнять вычитание")
    @Test
    public void shouldHaveCorrectSubtract(){
        int result = calculator.subtract(21, 15);
        assertEquals(6, result);
    }

    @DisplayName("Должен корректно выполнять умножение")
    @Test
    public void shouldHaveCorrectMultiply(){
        int result = calculator.multiply(3, 5);
        assertEquals(15, result);
    }

    @DisplayName("Должен корректно выполнять деление")
    @Test
    public void shouldHaveCorrectDivide(){
        int result = calculator.divide(12, 3);
        assertAll("деление/деление на ноль",
                () -> assertEquals(4, result),
                () -> assertThrows(ArithmeticException.class, () -> {
                    calculator.divide(10, 0);
                }));

    }


}
