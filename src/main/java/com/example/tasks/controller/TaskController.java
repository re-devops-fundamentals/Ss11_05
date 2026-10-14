package com.example.tasks.controller;

import com.example.tasks.model.Task;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TaskController {

    private static final List<Task> TASKS = new ArrayList<>();

    static {
        TASKS.add(new Task(1L, "Học Spring Boot", "Tìm hiểu cơ bản về Spring Boot và tạo project đầu tiên", false));
        TASKS.add(new Task(2L, "Cài đặt Docker", "Cài đặt Docker Desktop và chạy thử container nginx", true));
        TASKS.add(new Task(3L, "Viết REST API", "Hoàn thành API /api/tasks lấy dữ liệu mock", false));
    }

    @GetMapping("/api/tasks")
    public List<Task> getTasks() {
        return TASKS;
    }
}
