package com.pracSpringBoot.Springboottutorial.service;

//import com.pracSpringBoot.Springboottutorial.entity.StudentDetails;
import com.pracSpringBoot.Springboottutorial.entity.StudentDetails;
import com.pracSpringBoot.Springboottutorial.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;


@Service
public class StudentServiceImp implements StudentService {
    @Autowired
    private StudentRepository studentRepository;
    @Override
    public StudentDetails saveDetails(StudentDetails details) {
        return studentRepository.save(details);
    }

    @Override
    public List<StudentDetails> fetchStudentList() {
        return studentRepository.findAll();
    }

    @Override
    public StudentDetails fetchStudentListByID(Long studentID) {
        return studentRepository.findById(studentID).get();
    }

    @Override
    public void deleteStudentDetialsByID(Long studentID) {
        studentRepository.deleteById(studentID);
    }

    @Override
    public StudentDetails updateStudentDetailsByID(Long studentID, StudentDetails details) {
        StudentDetails detDB= studentRepository.findById(studentID).get();

        //student name nd other details should be in the form of string in this case

        if (Objects.nonNull(details.getStudentName())&&!"".equalsIgnoreCase(details.getStudentName())){
            detDB.setStudentName(details.getStudentName());
        }

        if (Objects.nonNull(details.getDepartment())&&!"".equalsIgnoreCase(details.getDepartment())){
            detDB.setDepartment(details.getDepartment());
        }

        if (Objects.nonNull(details.getPlaceOfResidence())&&!"".equalsIgnoreCase(details.getPlaceOfResidence())){
            detDB.setPlaceOfResidence(details.getPlaceOfResidence());
        }

        return studentRepository.save(detDB);
    }

    @Override
    public StudentDetails fetchDetialsByName(String studentName) {

        return studentRepository.findByStudentNameIgnoreCase(studentName);     //there is no such method in repository called as find by name so we have to create one in the repository

    }

    @Override
    public StudentDetails fetchDetailsByRollNo(Long studentRollNo) {
        return studentRepository.findByStudentRollNo(studentRollNo);           //there is no such method in repository called as find by rollno so we have to create one in the repository

    }
    
}

