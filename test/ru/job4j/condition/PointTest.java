package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when0020distance() {
        int x1 = 0;
        int x2 = 0;
        int y1 = 2;
        int y2 = 0;
        double expected = 2.0;
        double out = Point.distance(x1, x2, y1, y2);
        Assert.assertEquals(expected, out, 0.1);
    }

    @SuppressWarnings("checkstyle:WhitespaceAfter")
    @Test
    public void when0022distance() {
        int x1 = 0;
        int x2 = 0;
        int y1 = 2;
        int y2 = 2;
        double expected = 2.82; //84271247461903;
        double out = Point.distance(x1, x2, y1, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when7132131distance() {
        int x1 = 7;
        int x2 = 13;
        int y1 = 21;
        int y2 = 31;
        double expected = 22.80; //350850198276;
        double out = Point.distance(x1, x2, y1, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}