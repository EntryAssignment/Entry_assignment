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
        return posts.stream().map(this::convertToResponsePostDTO).toList();
    }

    public ResponsePostDTO getPostById(Long id) {
        Optional<PostEntity> postEntityOptional = postRepository.findById(id);
        if (postEntityOptional.isPresent()) {
            return convertToResponsePostDTO(postEntityOptional.get());
        } else {
            throw new IllegalArgumentException("Post not found with id: " + id);
        }
    }

    public ResponsePostDTO createPost(RequestPostDTO requestPostDTO) {
        PostEntity postEntity = converToPostEntity(requestPostDTO);
        postEntity = postRepository.save(postEntity);
        return convertToResponsePostDTO(postEntity);
    }

    public ResponsePostDTO updatePost(long id, RequestPostDTO requestPostDTO) {
        Optional<PostEntity> postEntityOptional = postRepository.findById(id);
        if (postEntityOptional.isPresent()) {
            PostEntity postEntity = postEntityOptional.get();
            postEntity.setContent(requestPostDTO.getContent());
            postEntity.setTitle(requestPostDTO.getTitle());
            postEntity.setUsername(requestPostDTO.getUsername());
            postRepository.save(postEntity);
            return convertToResponsePostDTO(postEntity);
        } else {
            throw new IllegalArgumentException("Post not found with id: " + id);
        }
    }

    public void deletePost(long id) {
        postRepository.deleteById(id);
    }

    private ResponsePostDTO convertToResponsePostDTO(PostEntity postEntity) {
        return new ResponsePostDTO(postEntity.getId(), postEntity.getUsername(), postEntity.getTitle(),
                postEntity.getContent());
    }

    private PostEntity converToPostEntity(RequestPostDTO requestPostDTO) {
        return new PostEntity(requestPostDTO.getUsername(), requestPostDTO.getTitle(),
                requestPostDTO.getContent());
    }
}
