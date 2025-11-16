package edu.icet.controller;


import edu.icet.model.dto.Student;
import edu.icet.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("Student")

public class StudentController {


    @Autowired
    StudentService studentService;

    @PostMapping("/add")
    public void add(@RequestBody Student student){
        studentService.add(student);
    }


}
