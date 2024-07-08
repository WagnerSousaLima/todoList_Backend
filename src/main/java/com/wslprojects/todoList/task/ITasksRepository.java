package com.wslprojects.todoList.task;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ITasksRepository extends JpaRepository<TaskModel, UUID> {



}
