package edu.icet.service;

import edu.icet.model.dto.Student;
import edu.icet.model.entity.StudentEntity;
import edu.icet.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public void add(Student student){
        StudentEntity studentEntity=new StudentEntity(
                student.getId(),
                student.getName(),
                student.getEmail(),
                student.getAge(),
                student.getPhoneNumber()


        );
        studentRepository.save(studentEntity);
    }





}
