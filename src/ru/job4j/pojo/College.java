package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFio("Andrey Belokur");
        student.setGroup("2195");
        student.setEnterdate(new Date());

        System.out.println(student.getFio() + " is a student of " + student.getGroup() + "'s group since " + student.getEnterdate());
    }
}
