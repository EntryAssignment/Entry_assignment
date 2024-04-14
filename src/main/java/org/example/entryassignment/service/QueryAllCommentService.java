package org.example.entryassignment.service;

import lombok.RequiredArgsConstructor;
import org.example.entryassignment.dto.response.CommentListResponse;
import org.example.entryassignment.dto.response.CommentResponse;
import org.example.entryassignment.repository.CommentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class QueryAllCommentService {
    private final CommentRepository commentRepository;

    public CommentResponse queryAllComment(Long postId){
        return CommentResponse.builder()
                .postId(postId)
                .responseList(commentRepository.findByPostId(postId)
                        .stream()
                        .map(CommentListResponse::commentListResponse)
                        .toList())
                .build();
    }
}
