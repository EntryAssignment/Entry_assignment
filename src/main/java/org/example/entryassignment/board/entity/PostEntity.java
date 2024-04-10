package org.example.entryassignment.board.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import org.example.entryassignment.board.dto.request.RequestPostDTO;

@Entity
@Setter
@Getter
public class PostEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String username;
    private String title;
    private String content;

    public PostEntity() {
    }

    public PostEntity(RequestPostDTO requestPostDTO) {
        this.username = requestPostDTO.getUsername();
        this.title = requestPostDTO.getTitle();
        this.content = requestPostDTO.getContent();
    }
}
