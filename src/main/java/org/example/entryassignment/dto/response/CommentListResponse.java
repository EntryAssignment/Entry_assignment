package org.example.entryassignment.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import org.example.entryassignment.entity.Comment;

@Getter
@Builder
@AllArgsConstructor
public class CommentListResponse {
    private String content;
    private String username;

    public static CommentListResponse commentListResponse(Comment comment) {
        return CommentListResponse.builder()
                .content(comment.getContent())
                .username(comment.getUsername())
                .build();
    }

}
