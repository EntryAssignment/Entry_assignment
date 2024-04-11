package org.example.entryassignment.user.dto.response;

import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Setter
@RequiredArgsConstructor
public class UserResponse {
    private String userId;
    private String userEmail;
    private String userPw;
}
