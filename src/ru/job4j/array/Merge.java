package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int i = 0;
        int i_left = 0;
        int i_right = 0;
        while (i_left < left.length && i_right < right.length) {
            rsl[i++] = left[i_left] < right[i_right] ? left[i_left++] : right[i_right++];
        }
        while (i_left < left.length) {
            rsl[i++] = left[i_left++];
        }
        while (i_right < right.length) {
            rsl[i++] = right[i_right++];
        }
        return rsl;
    }
}