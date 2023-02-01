package com.example.Intro.TaskManagement.repositories;

import com.example.Intro.TaskManagement.models.InternalTask;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InternalTaskRepository extends JpaRepository<InternalTask,Integer> {
}
