package com.example.backend1.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="patient_table")
@Data
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String email;

    private String pNo;

    private String gender;

//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getpNo() {
//        return pNo;
//    }
//
//    public void setpNo(String pNo) {
//        this.pNo = pNo;
//    }
//
//    public String getGender() {
//        return gender;
//    }
//
//    public void setGender(String gender) {
//        this.gender = gender;
//    }

}
