package ru.buttonone.testng;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import ru.buttonone.calculator.Calculator;
import ru.buttonone.calculator.CalculatorImpl;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertThrows;

public class CalculatorTestNg {
    Calculator calculator = new CalculatorImpl();

    @Test(description = "Должен корректно суммировать значения")
    public void shouldHaveCorrectSum() {

        assertEquals(8, calculator.sum(3, 5));

    }

    @Test(description = "Должен корректно выполнять вычитание")
    public void shouldHaveCorrectSubtract() {

        assertEquals(6, calculator.subtract(21, 15));

    }

    @Test(description = "Должен корректно выполнять умножение")
    public void shouldHaveCorrectMultiply() {

        assertEquals(15, calculator.multiply(3, 5));
    }

    @Test(description = "Должен выбрасывать исключение при делении на ноль",
            expectedExceptions = {IllegalArgumentException.class},
            expectedExceptionsMessageRegExp = "Cannot divide by zero")
    public void shouldHaveCorrectDivideZero() {

        calculator.divide(10, 0);

    }

    @Test(description = "Должен корректно выполнять деление")
    public void shouldHaveCorrectDivide() {

        assertEquals(4, calculator.divide(12, 3));

    }

}
