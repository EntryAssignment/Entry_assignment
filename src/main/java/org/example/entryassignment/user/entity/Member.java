package org.example.entryassignment.user.entity;

import jakarta.persistence.*;

@Entity
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String accountId;

    @Column(unique = true) /** 값이 겹치면 X **/
    private String userEmail;

    private String userPassword;
}
