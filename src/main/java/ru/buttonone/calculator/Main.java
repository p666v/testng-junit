package ru.buttonone.calculator;

public class Main {
    public static void main(String[] args) {

        Calculator calculator = new CalculatorImpl();
        System.out.println(calculator.sum(2,3));

    }
}
