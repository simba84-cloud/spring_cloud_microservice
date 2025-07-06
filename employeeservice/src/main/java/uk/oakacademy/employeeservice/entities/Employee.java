package uk.oakacademy.employeeservice.entities;

import jakarta.persistence.Id;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection="employees")
//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
public class Employee {
    @Id
    private String id;
//    @NotBlank
    @NotEmpty
    private String name;
    private String surname;
    @Size(min = 10, max = 50)
    @Email
    //@Pattern(regexp = "[a-zA-z0-9]")
    private String email;
    private String job;
    @Min(10)
    @Max(100)
    //@Pattern(regexp = "[0-9]")
    //@DecimalMin()
    //@DecimalMax()
    //@Positive
    //@PositiveOrZero
//    @Negative
//    @NegativeOrZero
    private int age;
//    @Future
//    @Past
    @CreationTimestamp
    private Date addedDate;

    public Employee() {
    }

    public Employee(String id, String name, String surname, String email, String job, int age, Date addedDate) {
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

    public @NotEmpty String getName() {
        return name;
    }

    public void setName(@NotEmpty String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public @Size(min = 10, max = 50) @Email String getEmail() {
        return email;
    }

    public void setEmail(@Size(min = 10, max = 50) @Email String email) {
        this.email = email;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Min(10)
    @Max(100)
    public int getAge() {
        return age;
    }

    public void setAge(@Min(10) @Max(100) int age) {
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
        return "Employee{" +
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
