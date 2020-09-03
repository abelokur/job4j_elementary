package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        int result = left > right ? left : right;
        return result;
    }

    public static int max(int left, int middle, int right) {
        return max(left, max(middle, right));
    }

    public static int max(int number1, int number2, int number3, int number4) {
        return max(max(number1, number2), max(number3, number4));
    }
}