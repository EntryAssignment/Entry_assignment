package org.example.entryassignment.board.dto.response;

import org.example.entryassignment.board.entity.PostEntity;

public class ResponsePostDTO {
    private Long id;
    private String username;
    private String title;
    private String content;

    public ResponsePostDTO(PostEntity postEntity) {
        this.id = postEntity.getId();
        this.username = postEntity.getUsername();
        this.title = postEntity.getTitle();
        this.content = postEntity.getContent();
    }
}
