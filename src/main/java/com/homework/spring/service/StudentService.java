package com.homework.spring.service;

import com.homework.spring.model.Student;
import com.homework.spring.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentService {

    private final StudentRepository studentRepository;
    private Integer counter=0;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student getStudent(Integer id) {
        return studentRepository.findById(id).orElseThrow();
    }

    public Student createStudent(Student student) {
        student.setId(++counter);
        return studentRepository.save(student);
    }

    public List<Student> getStudents() {
        return studentRepository.findAll();
    }


    public Student deleteStudent(Integer id){
        return studentRepository.delete(id);
    }
}
