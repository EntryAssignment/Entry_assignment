package org.example.entryassignment.user.dto.request;

public class RequestUserDTO {
    private Long nickname;

    public RequestUserDTO(Long nickname) {
        this.nickname = nickname;
    }

    public Long getNickname() {
        return nickname;
    }

    public void setNickname(Long nickname) {
        this.nickname = nickname;
    }
}
