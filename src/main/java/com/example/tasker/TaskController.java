package com.example.tasker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class TaskController {

    private TaskRepository taskRepository;

//    public TaskController(TaskRepository taskRepository) {
//        this.taskRepository = taskRepository;
//    }

    @Autowired
    public TaskController(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }


    @GetMapping("/")
    public String listAllTasks(Model model){
        List<Task> allTasks = taskRepository.findAll();
        model.addAttribute("allTasks", allTasks);
        return "listAllTasks";
    }

    @GetMapping("/archive")
    public String listarchived(){
    return "archive";
    }

    @GetMapping("/add")
    public String addTaskForm(Model model){
        Task task = null;
        model.addAttribute("task", task);
        return "addTaskForm";
    }

    @PostMapping("/saveTask")
    public String save(Task task, @RequestParam String name, @RequestParam String description,
                       @RequestParam boolean realized) {
        task.setId(task.getId());
        task.setName(task.getName());
        task.setName(task.getDescription());
        task.setRealized(task.isRealized());
        taskRepository.save(task);
        return "redirect:/";
    }



}
