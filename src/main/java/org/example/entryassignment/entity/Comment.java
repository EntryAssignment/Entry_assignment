package org.example.entryassignment.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import org.example.entryassignment.dto.request.CommentRequest;

@Getter
@Entity
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String content;
    private String username;
    private long postId;

    public Comment(CommentRequest request) {
        this.content = request.getContent();
        this.username = request.getUsername();
        this.postId = request.getPostId();
    }
}