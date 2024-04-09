package org.example.entryassignment.user.entity;

public class Member {
    private String userName;
    private long nickname;
    private Long userId;
    private Long userEmail;
    private Long userPw;

    public Member() {
    }

    public Member(Long nickname) {
        this.nickname = nickname;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public long getNickname() {
        return nickname;
    }

    public void setNickname(long nickname) {
        this.nickname = nickname;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(Long userEmail) {
        this.userEmail = userEmail;
    }

    public Long getUserPw() {
        return userPw;
    }

    public void setUserPw(Long userPw) {
        this.userPw = userPw;
    }
}
