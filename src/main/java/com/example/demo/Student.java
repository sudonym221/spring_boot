package com.example.demo;

import javax.persistence.*;

@Entity
@Table(name = "student")
public class Student {
    @Column
    @Id
    private Integer id;

    @Column
    private String name;

    @Column
    private String email;

    public void setId(Long id) {
        this.id = Math.toIntExact(id);
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}