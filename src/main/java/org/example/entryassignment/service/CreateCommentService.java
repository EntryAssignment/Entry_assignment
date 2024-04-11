package org.example.entryassignment.service;

import lombok.RequiredArgsConstructor;
import org.example.entryassignment.dto.request.CommentRequest;
import org.example.entryassignment.entity.Comment;
import org.example.entryassignment.repository.CommentRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CreateCommentService {
    private final CommentRepository commentRepository;

    public void createComment(CommentRequest request){
        Comment comment = new Comment(request);
    }
}
