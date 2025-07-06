package uk.oakacademy.employeeservice.dto;

import lombok.*;

import java.util.Date;

//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//@Getter
//@Setter
//@ToString
public class EmployeeDTO {
    private String id;
    private String name;
    private String surname;
    private String email;
    private String job;
    private int age;
    private Date addedDate;

    public EmployeeDTO() {
    }

    public EmployeeDTO(String id, String name, String surname, String email, String job, int age, Date addedDate) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.job = job;
        this.age = age;
        this.addedDate = addedDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getAddedDate() {
        return addedDate;
    }

    public void setAddedDate(Date addedDate) {
        this.addedDate = addedDate;
    }

    @Override
    public String toString() {
        return "EmployeeDTO{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", job='" + job + '\'' +
                ", age=" + age +
                ", addedDate=" + addedDate +
                '}';
    }
}
