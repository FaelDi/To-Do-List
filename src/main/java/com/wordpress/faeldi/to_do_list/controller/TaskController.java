package com.wordpress.faeldi.to_do_list.controller;

import com.wordpress.faeldi.to_do_list.model.Task;
import com.wordpress.faeldi.to_do_list.service.TaskService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tasks")
public class TaskController extends BaseController<Task, TaskService> {

    public TaskController(TaskService service) {
        super(service);
    }

}
