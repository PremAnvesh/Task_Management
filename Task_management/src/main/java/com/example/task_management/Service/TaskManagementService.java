package com.example.task_management.Service;

import com.example.task_management.Entity.Task;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface TaskManagementService {
    Task saveTask(Task task);
    List<Task> getTasks();
    Task getTaskBytaskId(long taskId);

    Task deleteTaskBytaskId(long taskId);
}
