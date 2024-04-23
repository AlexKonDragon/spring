package com.homework.spring.controller;

import com.homework.spring.model.Student;
import com.homework.spring.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String getStudents(Model model) {
        List<Student> students = studentService.getStudents();
        model.addAttribute("students", students);
        model.addAttribute("student", new Student());
        return "test";
    }

    @RequestMapping(path = "/", method = RequestMethod.POST)
    public RedirectView createStudent(RedirectAttributes redirectAttributes, @ModelAttribute Student student) {
        studentService.createStudent(student);
        String message = "Created student " + student.getName() + " " + student.getSurname();
        RedirectView redirectView = new RedirectView("/");
        redirectAttributes.addFlashAttribute("studentMessage", message);
        return redirectView;
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    public String getStudent(Model model, @PathVariable("id") Integer id) {
        Student student = studentService.getStudent(id);
        model.addAttribute("student", student);
        return "data";
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.POST)
    public RedirectView deleteStudent(RedirectAttributes redirectAttributes, @PathVariable("id") Integer id, @ModelAttribute Student student) {
        String message =  "Student " + studentService.getStudent(id).getName() + " " + studentService.getStudent(id).getSurname();
        if (student.getWillDelete()) {
            studentService.deleteStudent(student.getId());
            message +=" was deleted.";
        }
        else {
            message += " wasn't deleted.";
        }
        RedirectView redirectView = new RedirectView("/");
        redirectAttributes.addFlashAttribute("studentMessage", message);
        return redirectView;
    }
//    @RequestMapping(path = "/", method = RequestMethod.GET)
//    public String getStudents(Model model) {
//        List<Student> students = studentService.getStudents();
//        model.addAttribute("students", students);
//        model.addAttribute("student", new Student());
//        return "test";
//    }
}

