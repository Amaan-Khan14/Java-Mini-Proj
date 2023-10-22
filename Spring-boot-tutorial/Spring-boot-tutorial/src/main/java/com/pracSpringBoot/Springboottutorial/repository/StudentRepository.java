package com.pracSpringBoot.Springboottutorial.repository;

import com.pracSpringBoot.Springboottutorial.entity.StudentDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<StudentDetails,Long> {

    public StudentDetails findByStudentName(String studentName);

    public StudentDetails findByStudentNameIgnoreCase(String studentName);


}
