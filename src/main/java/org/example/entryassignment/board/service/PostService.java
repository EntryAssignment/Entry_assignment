package org.example.entryassignment.board.service;

import java.util.List;
import java.util.Optional;

import lombok.RequiredArgsConstructor;
import org.example.entryassignment.board.dto.request.RequestPostDTO;
import org.example.entryassignment.board.dto.response.ResponsePostDTO;
import org.example.entryassignment.board.entity.PostEntity;
import org.example.entryassignment.board.repository.PostRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PostService {
    private final PostRepository postRepository;

    public List<ResponsePostDTO> getAllPosts() {
        List<PostEntity> posts = postRepository.findAll();
        return posts.stream().map(ResponsePostDTO::new).toList();
    }

    public ResponsePostDTO getPostById(Long id) {
        Optional<PostEntity> postEntityOptional = postRepository.findById(id);
        if (postEntityOptional.isPresent()) {
            return new ResponsePostDTO(postEntityOptional.get());
        } else {
            throw new IllegalArgumentException("Post not found with id: " + id);
        }
    }

    public void createPost(RequestPostDTO requestPostDTO) {
        PostEntity postEntity = new PostEntity(requestPostDTO);
        postRepository.save(postEntity);
    }

    public void updatePost(long id, RequestPostDTO requestPostDTO) {
        Optional<PostEntity> postEntityOptional = postRepository.findById(id);
        if (postEntityOptional.isPresent()) {
            PostEntity postEntity = postEntityOptional.get();
            postEntity.setContent(requestPostDTO.getContent());
            postEntity.setTitle(requestPostDTO.getTitle());
            postEntity.setUsername(requestPostDTO.getUsername());
            postRepository.save(postEntity);
        } else {
            throw new IllegalArgumentException("Post not found with id: " + id);
        }
    }

    public void deletePost(long id) {
        postRepository.deleteById(id);
    }
}
