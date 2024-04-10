package org.example.entryassignment.board.dto.request;

import lombok.Getter;

@Getter
public class RequestPostDTO {

    private String username;
    private String title;
    private String content;

    public RequestPostDTO(String title, String content) {
        this.title = title;
        this.content = content;
    }
}