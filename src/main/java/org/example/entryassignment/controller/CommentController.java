package org.example.entryassignment.controller;

import lombok.RequiredArgsConstructor;
import org.example.entryassignment.dto.request.CommentRequest;
import org.example.entryassignment.service.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/comment")
@RequiredArgsConstructor
public class CommentController {
    private final CreateCommentService createCommentservice;
    private final DeleteCommentService deleteCommentService;
    private final QueryAllCommentService queryAllCommentService;
    private final UpdateCommentService updateCommentService;

    @PostMapping
    public void createComment(CommentRequest commentRequest) {
        createCommentservice.createComment(commentRequest);
    }
}