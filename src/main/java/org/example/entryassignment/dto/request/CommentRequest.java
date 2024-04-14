package org.example.entryassignment.dto.request;


public record CommentRequest(
        String username,
        String content,
        Long postId
) {
}
