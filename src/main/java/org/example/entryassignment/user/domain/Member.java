package org.example.entryassignment.user.domain;

public class Member {
    private String name;
    private Long Id;
    private Long pw;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public Long getPw() {
        return pw;
    }

    public void setPw(Long pw) {
        this.pw = pw;
    }
}
