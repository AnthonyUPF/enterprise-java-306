package com.example.Intro.TaskManagement.repositories;

import com.example.Intro.TaskManagement.models.BillableTask;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillableTaskRepository extends JpaRepository<BillableTask,Integer> {
}
