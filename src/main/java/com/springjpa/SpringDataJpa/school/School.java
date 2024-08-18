package com.springjpa.SpringDataJpa.school;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.springjpa.SpringDataJpa.student.Student;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "T_SCHOOL")
public class School {

    @Id
    @GeneratedValue
    private Integer id;
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @OneToMany(
            mappedBy = "school_id"
    )
    @JsonManagedReference     //to break infinite loop
    private List<Student> students;

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public School() {
    }

    public School(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
