package org.example.entryassignment.dto.request;

import lombok.Getter;

@Getter
public class CommentRequest {
    private String username;
    private String content;
    private Long PostId;
}

