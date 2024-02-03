package com.piruntha.userlocation.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "userData")
public class User {
    @Id
    @GeneratedValue
    @Column(name = "Id")
    private int id;
    @Column(name = "Name")
    private String name;
    @Column(name = "Age")
    private int age;
    @Column(name = "Dob")
    private Date dob;
    @Column(name = "Email")
    private String email;
}
