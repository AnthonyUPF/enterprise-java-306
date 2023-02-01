package com.example.Intro.TaskManagement.repositories;

import com.example.Intro.TaskManagement.models.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task,Integer> {
}
