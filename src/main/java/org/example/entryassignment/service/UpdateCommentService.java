package org.example.entryassignment.service;

import lombok.RequiredArgsConstructor;
import org.example.entryassignment.repository.CommentRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UpdateCommentService {
    private final CommentRepository commentRepository;
}
