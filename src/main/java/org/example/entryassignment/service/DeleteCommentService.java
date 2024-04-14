package org.example.entryassignment.service;

import lombok.RequiredArgsConstructor;
import org.example.entryassignment.dto.request.DeleteCommentRequest;
import org.example.entryassignment.entity.Comment;
import org.example.entryassignment.repository.CommentRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DeleteCommentService {
    private final CommentRepository commentRepository;

    public void deleteComment(Long id, DeleteCommentRequest request){
        Comment comment = commentRepository.findById(id).orElseThrow(
                () -> new RuntimeException("")
        );
        if(!comment.getUsername().equals(request.username())){
            throw new RuntimeException("");
        }
        commentRepository.delete(comment);
    }
}
