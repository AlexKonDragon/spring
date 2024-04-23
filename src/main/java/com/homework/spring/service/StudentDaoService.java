package com.homework.spring.service;

import com.homework.spring.model.Student;

import java.util.List;

public interface StudentDaoService {
    Student createStudent(Student student);
    List<Student> findByGroupNumber(Integer groupNumber);
    List<Student> findAllHasDebt();
    List<Student> findByName(String name);
    List<Student> findBySurname(String surname);
    void deleteStudent(Integer id);
    Student addStudent(Student student);
    void changeGroup(Integer id, Integer newGroupNumber);

}
