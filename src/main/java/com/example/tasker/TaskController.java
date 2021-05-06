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

    List<Task> allTasks;

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
        Task task = new Task();
        model.addAttribute("task", task);
        return "addTaskForm";
    }

    @GetMapping("/edit")
    public String taskEdit(@RequestParam Long id, Model model){
        for (Task task : allTasks) {
            if (task.getId().equals(id)){
                model.addAttribute("task", task);
                return "taskEdit";
            }
        }
        return "redirect:/";
    }

    @PostMapping("/saveTask")
    public String save(Task task) {
        taskRepository.save(task);
        return "redirect:/";
    }



}
