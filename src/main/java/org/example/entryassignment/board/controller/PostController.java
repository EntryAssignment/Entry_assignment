package org.example.entryassignment.board.controller;

import java.util.List;

import lombok.RequiredArgsConstructor;
import org.example.entryassignment.board.dto.request.RequestPostDTO;
import org.example.entryassignment.board.dto.response.ResponsePostDTO;
import org.example.entryassignment.board.service.PostService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
@RequestMapping("/posts")
@RequiredArgsConstructor
public class PostController {
    final PostService postService;

    @GetMapping
    public List<ResponsePostDTO> getAllPosts() {
        return postService.getAllPosts();
    }

    @GetMapping("/{id}")
    public ResponsePostDTO getPostById(@PathVariable("id") Long id) {
        return postService.getPostById(id);
    }

    @PostMapping
    public ResponsePostDTO createPost(@RequestBody RequestPostDTO requestPostDTO) {
        return postService.createPost(requestPostDTO);
    }

    @PutMapping("/{id}")
    public ResponsePostDTO updatePost(@PathVariable("id") Long id, @RequestBody RequestPostDTO requestPostDTO) {
        return postService.updatePost(id, requestPostDTO);
    }

    @DeleteMapping("/{id}")
    public void deletePost(@PathVariable("id") Long id) {
        postService.deletePost(id);
    }
}
