package com.example.Intro.TaskManagement.models;


import jakarta.persistence.*;

import java.util.Date;

@Entity
public class BillableTask extends Task {



    public BillableTask() {
    }

    public BillableTask(String title, Date dueDate, Boolean status) {
        super(title, dueDate, status);
    }


}
