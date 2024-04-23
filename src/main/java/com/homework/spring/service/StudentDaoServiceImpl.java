package com.homework.spring.service;

import com.homework.spring.dao.StudentDAO;
import com.homework.spring.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentDaoServiceImpl implements StudentDaoService{
    @Autowired
    StudentDAO studentDAO;
    @Override
    public Student createStudent(Student student) {
        return studentDAO.save(student);
    }

    @Override
    public List<Student> findByGroupNumber(Integer groupNumber) {
        return studentDAO.findAllByGroupNumber(groupNumber);
    }

    @Override
    public List<Student> findAllHasDebt() {
        return studentDAO.findAllByHasDebt();
    }

    @Override
    public List<Student> findByName(String name) {
        return studentDAO.findAllByName(name);
    }

    @Override
    public List<Student> findBySurname(String surname) {
        return studentDAO.findAllBySurname(surname);
    }

    @Override
    public void deleteStudent(Integer id) {
        studentDAO.deleteById(id.longValue());
    }

    @Override
    public Student addStudent(Student student) {
        return studentDAO.saveAndFlush(student);
    }

    @Override
    public void changeGroup(Integer id, Integer newGroupNumber) {
        Student student = studentDAO.findById(id.longValue()).get();
        student.setGroupNumber(newGroupNumber);
        studentDAO.save(student);
    }
}
