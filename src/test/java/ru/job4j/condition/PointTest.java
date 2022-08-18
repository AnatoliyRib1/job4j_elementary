package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Assert.*;
import org.junit.Test;

public class PointTest {
    @Test
    public void when00To20Then2() {
        double expected = 2;
        int x1 = 0;
        int x2 = 0;
        int y1 = 2;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);

    }

    @Test
    public void when01To22Then1() {
        double expected = 1;
        int x1 = 0;
        int x2 = 1;
        int y1 = 2;
        int y2 = 2;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);

    }

    @Test
    public void when01To56Then1Dot41() {
        double expected = 1.41;
        int x1 = 0;
        int x2 = 1;
        int y1 = 5;
        int y2 = 6;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);

    }
}