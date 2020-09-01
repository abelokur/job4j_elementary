package ru.job4j.array;

public class TriangleMatrix {
    public static int[][] rows(int count) {
        //int[][] triangle = new int[count][count];
        int[][] triangle = {
                {1}, {2, 3}
        };
/*
        int n = 1;
        for (int i = 0; i < count; i++){
            for (int j = 0; j <= i; j++) {
                triangle[i][j] = n++;
            }
        }*/
        return triangle;
    }
}