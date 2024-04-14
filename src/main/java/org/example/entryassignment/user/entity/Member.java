package org.example.entryassignment.user.entity;

import jakarta.persistence.*;
import org.example.entryassignment.user.dto.request.UserRequest;
import org.example.entryassignment.user.dto.response.UserResponse;

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


    public Member(UserRequest request) {
        this.accountId = request.getAccountId();
        this.userEmail = request.getUserEmail();
        this.userPassword = request.getUserPassword();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
}
