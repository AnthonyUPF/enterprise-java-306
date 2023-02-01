package com.example.Intro.TaskManagement.models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class InternalTask extends Task {



    @Column(name="hourlyRate")
    private double hourlyRate;
    public InternalTask() {
    }

    public InternalTask(String title, Date dueDate, Boolean status, double hourlyRate) {
        super(title, dueDate, status);
        this.hourlyRate = hourlyRate;
    }




    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }



}
