package org.example.entryassignment.board.dto.request;

public class RequestPostDTO {
    private String username;
    private String title;
    private String content;

    public RequestPostDTO(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}