package com.example.daybyday.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "geust_table")
public class GuestEntity {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


}
