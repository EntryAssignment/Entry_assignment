package org.example.entryassignment.user.dto.request;

import lombok.Getter;

@Getter
public class UserRequest {
    private String accountId;
    private String userPassword;
    private String userEmail;
}