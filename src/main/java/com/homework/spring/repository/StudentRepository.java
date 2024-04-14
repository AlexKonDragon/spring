package com.homework.spring.repository;

import com.homework.spring.model.Student;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class StudentRepository {
    Map<Integer, Student> students = new HashMap<>();

    public Student save(Student student){
        return students.put(student.getId(), student);
    }

    public List<Student> findAll(){
        return students.values().stream().toList();
    }

    public Optional<Student> findById(Integer id){
        return students.values().stream()
                .filter(student -> student.getId()
                        .equals(id)).findFirst();
    }

    public Student delete(Integer id){
        return students.remove(id);
    }
}
