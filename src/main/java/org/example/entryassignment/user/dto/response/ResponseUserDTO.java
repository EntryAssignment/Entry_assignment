package org.example.entryassignment.user.dto.response;

import org.example.entryassignment.user.entity.Member;

public class ResponseUserDTO {
    private String userId;
    private String userEmail;
    private String userPw;

    public ResponseUserDTO(Member member) {
        this.userId = member.getUserId();
        this.userEmail = member.getUserEmail();
        this.userEmail = member.getUserPw();
    }
}
