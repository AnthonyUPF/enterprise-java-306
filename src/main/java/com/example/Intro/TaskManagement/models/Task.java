package com.example.Intro.TaskManagement.models;

import jakarta.persistence.*;

import java.util.Date;
import java.util.Objects;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTask;

    private String title;

    private Date dueDate;

    private Boolean Status;

    public Task() {
    }

    public Task(String title, Date dueDate, Boolean status) {
        this.title = title;
        this.dueDate = dueDate;
        Status = status;
    }

    public int getIdTask() {
        return idTask;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Boolean getStatus() {
        return Status;
    }

    public void setStatus(Boolean status) {
        Status = status;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return idTask == task.idTask && Objects.equals(title, task.title) && Objects.equals(dueDate, task.dueDate) && Objects.equals(Status, task.Status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idTask, title, dueDate, Status);
    }
}
