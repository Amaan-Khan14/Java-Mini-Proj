package com.pracSpringBoot.Springboottutorial.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;

@Entity
public class StudentDetails {
    @NotBlank(message = "PLease Provide Student Name")              //through this when posting of details is done the user have to compulsory provide the Student Name if not then it will give a bad request
    private String studentName;


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long studentID;


    private long studentRollNo;

    private long currentYear;

    @NotBlank(message = "Provide Department, mandatory field,body must contain department")
    private String department;

    private long passingYear;

    private String placeOfResidence;


    public long getCurrentYear() {
        return currentYear;
    }

    public void setCurrentYear(long currentYear) {
        this.currentYear = currentYear;
    }

    public long getPassingYear() {
        return passingYear;
    }

    public void setPassingYear(long passingYear) {
        this.passingYear = passingYear;
    }

    public String getPlaceOfResidence() {
        return placeOfResidence;
    }

    public void setPlaceOfResidence(String placeOfResidence) {
        this.placeOfResidence = placeOfResidence;
    }

    public long getStudentRollNo() {

        return studentRollNo;
    }

    public void setStudentRollNo(long studentRollNo) {
        this.studentRollNo = studentRollNo;
    }




    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }


    public long getStudentID() {
        return studentID;
    }

    public void setStudentID(long studentID) {
        this.studentID = studentID;
    }

    public StudentDetails(String studentName, long studentID) {
        this.studentName = studentName;

        this.studentID = studentID;
    }

    @Override
    public String toString() {
        return "StudentDetails{" +
                "studentName='" + studentName + '\'' +
                ", studentID=" + studentID +
                ", studentRollNo=" + studentRollNo +
                ", currentYear=" + currentYear +
                ", department='" + department + '\'' +
                ", passingYear=" + passingYear +
                ", placeOfResidence='" + placeOfResidence + '\'' +
                '}';
    }


    public StudentDetails() {
    }
}
