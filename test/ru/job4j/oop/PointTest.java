package ru.job4j.oop;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when0020distance() {
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double expected = 2.0;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.1);
    }

   //@SuppressWarnings("checkstyle:WhitespaceAfter")
    @Test
    public void when0022distance() {
        Point a = new Point(0, 0);
        Point b = new Point(2, 2);
        double expected = 2.82; //84271247461903;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when7132131distance() {
        Point a = new Point(7, 13);
        Point b = new Point(21, 31);
        double expected = 22.80; //350850198276;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when000111distance3d() {
        Point a = new Point(0, 0, 0);
        Point b = new Point(1, 1, 1);
        double expected = 1.73;
        double out = a.distance3d(b);
    }

    @Test
    public void when000222distance3d() {
        Point a = new Point(0, 0, 0);
        Point b = new Point(2, 2, 2);
        double expected = 3.46;
        double out = a.distance3d(b);
    }
}