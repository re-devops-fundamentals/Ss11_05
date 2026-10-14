package com.example.tasks.controller;

import com.example.tasks.model.Task;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TaskControllerTest {

    private final TaskController taskController = new TaskController();

    @Test
    void shouldReturnAllTasks() {
        List<Task> tasks = taskController.getTasks();

        assertNotNull(tasks, "Tasks list should not be null");
        assertEquals(3, tasks.size(), "Tasks list size should be 3");
        assertEquals("Học Spring Boot", tasks.get(0).getTitle());
        assertEquals("Cài đặt Docker", tasks.get(1).getTitle());
        assertEquals("Viết REST API", tasks.get(2).getTitle());
    }

    @Test
    void shouldVerifyTaskProperties() {
        List<Task> tasks = taskController.getTasks();
        Task firstTask = tasks.get(0);

        assertEquals(1L, firstTask.getId());
        assertFalse(firstTask.isCompleted());
        assertEquals("Tìm hiểu cơ bản về Spring Boot và tạo project đầu tiên", firstTask.getDescription());
    }
}
