package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMaxLeft() {
        int result = Max.max(10, 2);
        assertThat(result, is(10));
    }

    @Test
    public void whenMaxRight() {
        int result = Max.max(10, 20);
        assertThat(result, is(20));
    }

    @Test
    public void whenEqual() {
        int result = Max.max(100, 100);
        assertThat(result, is(100));
    }
}