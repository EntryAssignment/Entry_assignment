package org.example.entryassignment.user.dto.response;

public class UserResponse {
    private String accountId;
    private String userEmail;

    public UserResponse(String accountId, String userEmail) {
        this.accountId = accountId;
        this.userEmail = userEmail;
    }
}
