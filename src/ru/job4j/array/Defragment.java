package ru.job4j.array;

import java.util.Arrays;
import java.util.Collections;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
                //int point = index; /* указатель на null ячейку. */
                /* переместить первую не null ячейку. Нужен цикл. */
                for (int pointnotnull = index; pointnotnull < array.length; pointnotnull++) {
                    if (array[pointnotnull] != null) {
                        //Collections.swap(Arrays.asList(array), point, pointnotnull);
                        array[index] = array[pointnotnull];
                        array[pointnotnull] = null;
                        break;
                    }
                }
            }
            System.out.print(array[index] + " ");
        }
        return array;
    }

    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (int index = 0; index < compressed.length; index++) {
            System.out.print(compressed[index] + " ");
        }
    }
}