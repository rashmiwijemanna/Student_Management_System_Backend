package edu.icet.controller;


import edu.icet.model.dto.Student;
import edu.icet.model.entity.StudentEntity;
import edu.icet.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Student")

public class StudentController {


    @Autowired
    StudentService studentService;

    @PostMapping("/add")
    public void add(@RequestBody Student student){
        studentService.add(student);
    }

    @GetMapping("/getAll")
    public List<Student> getAllStudentDetails(){
        return studentService.getAllStudentDetails();
    }

   @GetMapping("/{id}")
    public Student getById(@PathVariable String id){
        return studentService.getById(id);
    }

    @PutMapping("/{updateId}")
    public Student updateStudent(@PathVariable String updateId, @RequestBody StudentEntity student){
        return studentService.updateStudent(updateId, student);

    }

    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable String id){
         studentService.deleteStudent(id);
    }



}
