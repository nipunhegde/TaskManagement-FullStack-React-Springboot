package com.fullstack.Task.service.repo;

import com.fullstack.Task.service.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task,Long> {
    List<Task> findByassignedUserId(Long userId);
}
