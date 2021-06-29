package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double subAndDiv(double first, double second) {
        return subtraction(first, second)
                + division(first, second);
    }

    public static double sumAll(double first, double second) {
        return sumAndMultiply(first, second) + subAndDiv(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Сумма + умножение " + sumAndMultiply(10, 20));
        System.out.println("Разность + деление равно: " + subAndDiv(10, 20));
        System.out.println("Сумма + умножение + разность + деление равно: " + sumAll(10, 20));
    }
}
