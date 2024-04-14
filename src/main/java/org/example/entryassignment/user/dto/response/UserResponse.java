package org.example.entryassignment.user.dto.response;

public class UserResponse {
    private String accountId;
    private String userEmail;

    public UserResponse(String accountId, String userEmail) {
        this.accountId = accountId;
        this.userEmail = userEmail;
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
}
