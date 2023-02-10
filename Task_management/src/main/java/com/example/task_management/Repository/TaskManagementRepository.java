package com.example.task_management.Repository;

import com.example.task_management.Entity.Task;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskManagementRepository extends MongoRepository<Task , String> {
    public Task findTaskBytaskId(long id);
    public Task deleteTaskBytaskId(long id);
}
