package com.pracSpringBoot.Springboottutorial.service;
//one service may have multiple implementation thus creating an interface

import com.pracSpringBoot.Springboottutorial.entity.StudentDetails;

import java.util.List;

public interface StudentService {

     public StudentDetails saveDetails(StudentDetails details);

     public List<StudentDetails> fetchStudentList();

     public StudentDetails fetchStudentListByID(Long studentID);

     public void deleteStudentDetialsByID(Long studentID);
     
     public StudentDetails updateStudentDetailsByID(Long studentID, StudentDetails details);

     public StudentDetails fetchDetialsByName(String studentName);

     public StudentDetails fetchDetailsByRollNo(Long studentRollNo);

}
