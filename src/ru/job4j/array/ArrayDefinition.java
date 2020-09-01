package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surname = new String[100500];
        float[] prices = new float[40];
        System.out.println("Размер массива ages равен: " + ages.length);
        System.out.println("Размер массива surname равен: " + surname.length);
        System.out.println("Размер массива prices равен: " + prices.length);
        String[] names = new String[4];
        names[0] = "Andrey Belokur";
        names[1] = "Andrey Semenov";
        names[2] = "Sergei Kovalenko";
        names[3] = "Aleksandr Stepanov";
            System.out.println(names[0]);
            System.out.println(names[1]);
            System.out.println(names[2]);
            System.out.println(names[3]);

    }
}
