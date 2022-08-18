package ru.job4j.condition;

public class SqArea {
    public static double square(double p, double k) {
        double h = p / (2 * (k + 1));
        double l = h * k;
        double s = l * h;
        return h;

    }

    public static void main(String[] args) {
        double result1 = SqArea.square(6, 2);
        System.out.println(" p = 6, k = 2, s = 2, real = " + result1);
    }
}
/*как я выяснил, простым путем более одного значения из метода square java вернуть не дает, а потому объявление и
расчет переменных l и s  в целом внутри метода не имеют значения. Может просто я неправильно понял смысл */