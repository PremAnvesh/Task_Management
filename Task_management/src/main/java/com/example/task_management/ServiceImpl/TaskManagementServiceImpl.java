package com.example.task_management.ServiceImpl;

import com.example.task_management.Entity.Task;
import com.example.task_management.Repository.TaskManagementRepository;
import com.example.task_management.Service.TaskManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TaskManagementServiceImpl implements TaskManagementService {
    @Autowired
    TaskManagementRepository taskManagementRepository;
    @Override
    public Task saveTask(Task task) {
       return this.taskManagementRepository.save(task);
    }

    @Override
    public List<Task> getTasks() {
        return this.taskManagementRepository.findAll();
    }

    @Override
    public Task getTaskBytaskId(long taskId) {
        return this.taskManagementRepository.findTaskBytaskId(taskId);
    }

    @Override
    public Task deleteTaskBytaskId(long taskId) {
        return this.taskManagementRepository.deleteTaskBytaskId(taskId);
    }

}
