package edu.icet.service;

import edu.icet.model.dto.Student;
import edu.icet.model.entity.StudentEntity;
import edu.icet.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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

    public List<Student> getAllStudentDetails(){
        List<StudentEntity> all = studentRepository.findAll();
        List<Student> students=new ArrayList<>();

        for (StudentEntity studentEntity:all){
            students.add(new Student(
                    studentEntity.getId(),
                    studentEntity.getName(),
                    studentEntity.getEmail(),
                    studentEntity.getAge(),
                    studentEntity.getPhoneNumber()
            ));
        }
        return students;

    }
    public Student getById(String id){
        Optional<StudentEntity> byId = studentRepository.findById(String.valueOf(id));
        StudentEntity studentEntity=byId.orElseThrow();
        return new Student(
                studentEntity.getId(),
                studentEntity.getName(),
                studentEntity.getEmail(),
                studentEntity.getAge(),
                studentEntity.getPhoneNumber()
        );
    }





}
