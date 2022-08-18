package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double minusAndDel(double first, double second) {
        return minus(first, second) + del(first, second);
    }

    public static double summAll(double first, double second) {
        return sum(first, second) + minus(first, second)
                + multiply(first, second) + del(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + summAll(10, 20));
    }
}
