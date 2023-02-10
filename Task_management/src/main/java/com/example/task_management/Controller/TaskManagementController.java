package com.example.task_management.Controller;

import com.example.task_management.Entity.Task;
import com.example.task_management.Service.TaskManagementService;
import com.example.task_management.ServiceImpl.TaskManagementServiceImpl;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/api")
public class TaskManagementController {

    @Autowired
    TaskManagementServiceImpl taskManagementService;
@GetMapping("/hello")
    public ResponseEntity<String> helloWorld(){
    return new ResponseEntity<String>("Hello", HttpStatus.OK);
}

@PostMapping("/saveTask")
    public ResponseEntity<Task> saveTask(@RequestBody Task task){
    return new ResponseEntity<Task>(this.taskManagementService.saveTask(task),HttpStatus.CREATED);
}

@GetMapping("/allTasks")
    public ResponseEntity<List<Task>> getAllTasks(){
    return new ResponseEntity<List<Task>>(this.taskManagementService.getTasks(),HttpStatus.OK);
}

@GetMapping("/getTask")
    public ResponseEntity<Task> getTaskBytaskId(@RequestParam("id") long id){
    return new ResponseEntity<Task>(this.taskManagementService.getTaskBytaskId(id) ,HttpStatus.OK);
}

@DeleteMapping("/")
    public ResponseEntity<Task> deleteTaskBytaskId(@RequestParam("id") long id){
    return new ResponseEntity<Task>(this.taskManagementService.deleteTaskBytaskId(id), HttpStatus.OK);
}
}
