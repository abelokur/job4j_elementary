package ru.job4j.oop;

import java.time.LocalDateTime;

public class Doctor extends Profession {

    private LocalDateTime[] scheduler;
    private String clinic;

    public String getClinic() {
        return clinic;
    }

    public LocalDateTime[] getScheduler() {
        return scheduler;
    }

    public String Diagnosis (Patient patient) {
        return " ";
    }

}
