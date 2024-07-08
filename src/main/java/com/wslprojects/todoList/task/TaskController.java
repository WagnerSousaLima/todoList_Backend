package com.wslprojects.todoList.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    @Autowired
    private ITasksRepository tasksRepository;

    @PostMapping("/")
    private TaskModel create(@RequestBody TaskModel taskModel){
        var task = this.tasksRepository.save(taskModel);
        return task;

    }
}
