package org.example.entryassignment.user.dto.response;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.example.entryassignment.user.entity.Member;

@Setter
@RequiredArgsConstructor
public class ResponseUserDTO {
    private String userId;
    private String userEmail;
    private String userPw;
}
