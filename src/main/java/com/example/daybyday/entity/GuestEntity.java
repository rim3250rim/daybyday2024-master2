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

    @Column(unique = true)
    private String guestname;

    @Column (unique = true) //유일한 값을 가져아 한다는 제약조건
    private String guestemail;
}
