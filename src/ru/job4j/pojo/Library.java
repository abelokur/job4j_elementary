package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book cleancode = new Book("Clean code", 400);
        Book browncode = new Book("Brown code", 500);
        Book greencode = new Book("Green code", 600);
        Book whitecode = new Book("White code", 700);
        Book[] books = new Book[4];
        books[0] = cleancode;
        books[1] = browncode;
        books[2] = greencode;
        books[3] = whitecode;
        for (int index = 0; index < books.length; index++) {
            Book bk = books[index];
            System.out.println(bk.getName() + " " + bk.getPages());
        }
        Book bkc = books[3];
        books[3] = books[0];
        books[0] = bkc;
        for (int index = 0; index < books.length; index++) {
            Book bk = books[index];
            System.out.println(bk.getName() + " " + bk.getPages());
        }
        for (int index = 0; index < books.length; index++) {
            Book bk = books[index];
            if (bk.getName() == "Clean code") {
                System.out.println(bk.getName() + " " + bk.getPages());
            }
        }
    }
}
