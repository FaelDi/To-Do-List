package com.wordpress.faeldi.to_do_list.service;

import com.wordpress.faeldi.to_do_list.model.Task;
import com.wordpress.faeldi.to_do_list.repository.TaskRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TaskService implements BaseService<Task,Long>{

    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }


    @Override
    public List<Task> findAll() {
        return List.of();
    }

    @Override
    public Task findById(Long id) {
        return null;
    }

    @Override
    public Task create(Task obj) {
        return null;
    }

    @Override
    public Task edit(Long id, Task obj) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
