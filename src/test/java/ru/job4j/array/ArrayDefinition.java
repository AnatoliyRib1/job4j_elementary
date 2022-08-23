package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        int[] ages = new int[10];
            System.out.println(ages.length);
        String[] surnames = new String[100500];
            System.out.println(surnames.length);
        float[] prices = new float[40];
            System.out.println(prices.length);
        String[] names = new String[4];
        names[0] = "Viktoriya";
        names[1] = "Anatoliy";
        names[2] = "Tatiana";
        names[3] = "Richard";

        for (String num : names) {
            System.out.println(num);
        }
    }
}
