package org.example.entryassignment.controller;

import lombok.RequiredArgsConstructor;
import org.example.entryassignment.dto.request.CommentRequest;
import org.example.entryassignment.dto.request.DeleteCommentRequest;
import org.example.entryassignment.dto.request.UpdateCommentRequest;
import org.example.entryassignment.dto.response.CommentResponse;
import org.example.entryassignment.service.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/comment")
@RequiredArgsConstructor
public class CommentController {
    private final CreateCommentService createCommentservice;
    private final DeleteCommentService deleteCommentService;
    private final QueryAllCommentService queryAllCommentService;
    private final UpdateCommentService updateCommentService;

    @PostMapping
    public void createComment(
           @RequestBody CommentRequest commentRequest) {
        createCommentservice.createComment(commentRequest);
    }

    @DeleteMapping("/{id}")
    public void deleteComment(
            @PathVariable Long id, @RequestBody DeleteCommentRequest deleteCommentRequest) {
        deleteCommentService.deleteComment(id, deleteCommentRequest);}

    @GetMapping("/{post-id}")
    public CommentResponse queryComment(@PathVariable(name = "post-id") Long postId) { return queryAllCommentService.queryAllComment(postId);}

    @PatchMapping("/{id}")
    public void updateComment(@PathVariable Long id, @RequestBody UpdateCommentRequest updateCommentRequest) {updateCommentService.updateComment(id, updateCommentRequest);}
}