package com.homework.spring.dao;

import com.homework.spring.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository

public interface StudentDAO extends JpaRepository<Student, Long> {
    List<Student> findAllByGroupNumber(final Integer groupNumber);
    @Query(value = "Select * from student_table where for_payment > 0", nativeQuery = true)
    List<Student> findAllByHasDebt();
    @Query(value = "Select * from student_table where name = :name", nativeQuery = true)
    List<Student> findAllByName(@Param("name") String name);
    @Query(value = "Select * from student_table where surname = :surname", nativeQuery = true)
    List<Student> findAllBySurname(@Param("surname") String surname);


}
