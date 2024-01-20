package ru.buttonone.testng;

import org.testng.annotations.Test;
import ru.buttonone.calculator.Calculator;
import ru.buttonone.calculator.CalculatorImpl;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertThrows;

public class CalculatorTestNg {
    Calculator calculator = new CalculatorImpl();

    @Test(description = "Должен корректно суммировать значения")
    public void shouldHaveCorrectSum() {
        int result = calculator.sum(3, 5);
        assertEquals(8, result);
    }

    @Test(description = "Должен корректно выполнять вычитание")
    public void shouldHaveCorrectSubtract() {
        int result = calculator.subtract(21, 15);
        assertEquals(6, result);
    }

    @Test(description = "Должен корректно выполнять умножение")
    public void shouldHaveCorrectMultiply() {
        int result = calculator.multiply(3, 5);
        assertEquals(15, result);
    }

    @Test(description = "Должен корректно выполнять деление")
    public void shouldHaveCorrectDivide() {
        int result = calculator.divide(12, 3);
        assertEquals(4, result);
        assertThrows(ArithmeticException.class, () -> {
            calculator.divide(10, 0);
        });

    }
}
