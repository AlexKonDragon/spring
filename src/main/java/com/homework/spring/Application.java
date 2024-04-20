package com.homework.spring;

import com.homework.spring.dao.StudentDAO;
import com.homework.spring.model.Student;
import com.homework.spring.service.StudentDaoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class Application implements CommandLineRunner {
	@Autowired
	private StudentDAO studentDAO;
	@Autowired
	private StudentDaoServiceImpl service;


	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	@Override
	public void run(String... args) throws Exception {

		System.out.println("Do");
	}
}
