package ru.job4j.oop;

public class Calculator {
    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public static int minus(int z) {
        return z - x;
    }

    public int divide(int r) {
        return r / x;
    }

    public int multiply(int a) {
        return x * a;
    }

    public int sumAllOperation(int e) {
        return sum(e) + multiply(e) + minus(e) + divide(e);
    }

    public static void main(String[] args) {
        int result = sum(10);
        System.out.println(result);
        int resminus = minus(5);
        System.out.println(resminus);
        Calculator calculator = new Calculator();
        int rsl = calculator.multiply(5);
        System.out.println(rsl);
        int rslDivide = calculator.divide(10);
        System.out.println(rslDivide);
        int rslAll = calculator.sumAllOperation(10);
        System.out.println(rslAll);
    }
}
