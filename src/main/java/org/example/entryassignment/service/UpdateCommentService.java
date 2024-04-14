package org.example.entryassignment.service;

import lombok.RequiredArgsConstructor;
import org.example.entryassignment.dto.request.UpdateCommentRequest;
import org.example.entryassignment.entity.Comment;
import org.example.entryassignment.repository.CommentRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UpdateCommentService {
    private final CommentRepository commentRepository;

    public void updateComment(Long id, UpdateCommentRequest request) {
        Comment comment = commentRepository.findById(id).orElseThrow(
                () -> new RuntimeException("")
        );
        if(!comment.getUsername().equals(request.getUsername())){
            throw new RuntimeException("");
        }
        comment.update(
                request.getContent()
        );
        commentRepository.save(comment);
    }
}
