package com.pracSpringBoot.Springboottutorial.controller;

import com.pracSpringBoot.Springboottutorial.entity.StudentDetails;
import com.pracSpringBoot.Springboottutorial.service.StudentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    //Creating APIs
    @Autowired                                                      //property based autowiring
    private StudentService service;
    @PostMapping("/details")
    public StudentDetails saveDetails(@Valid @RequestBody StudentDetails details){
        return service.saveDetails(details);

    }

    @GetMapping("/details")
    public List<StudentDetails> fetchStudentDetails(){

        return service.fetchStudentList();
    }
    @GetMapping("/details/{id}")
    public StudentDetails fetchStudentDetailsByID(@PathVariable("id")Long studentID){
        return service.fetchStudentListByID(studentID);
    }

    @DeleteMapping("/details/{id}")
    public String deleteStudentDetailsByID(@PathVariable("id")Long studentID){

        service.deleteStudentDetialsByID(studentID);
        return "Department Deleted Successfully!!!!";

    }

    @PatchMapping("/details/{id}")
    public String updateStudentDetailsByID(@PathVariable("id")Long studentID, @RequestBody StudentDetails details){
        service.updateStudentDetailsByID(studentID,details);
        return "Value Updated Successfully!!";
    }

    @GetMapping("/details/name/{name}")
    public StudentDetails fetchDetailsByName(@PathVariable("name") String studentName){

        return service.fetchDetialsByName(studentName);

    }

    //End of APIs



}
