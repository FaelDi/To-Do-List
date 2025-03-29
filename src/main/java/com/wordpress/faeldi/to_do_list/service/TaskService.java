package com.wordpress.faeldi.to_do_list.service;

import com.wordpress.faeldi.to_do_list.model.Task;
import com.wordpress.faeldi.to_do_list.repository.TaskRepository;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Component
public class TaskService implements BaseService<Task>{

    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }


    @Override
    public List<Task> findAll() {
        return taskRepository.findAll();
    }

    @Override
    public Task findById(Long id) {
        var task =  taskRepository.findById(id);
        return task.orElse(null);
    }

    @Override
    public Task create(Task obj) {
        obj.setCreatedAt(LocalDateTime.now());
        obj.setUpdatedAt(LocalDateTime.now());
        return taskRepository.save(obj);
    }

    @Override
    public Task edit(Long id, Task obj) {

        var task =  taskRepository.findById(id);
        if(task.isPresent()){
            var validTask = task.get();

            validTask.setTitle(obj.getTitle());
            validTask.setCompleted(obj.isCompleted());
            validTask.setUpdatedAt(LocalDateTime.now());
            taskRepository.save(validTask);
            return validTask;
        }
        return null;
    }

    @Override
    public void delete(Long id) {
        taskRepository.deleteById(id);
    }
}
