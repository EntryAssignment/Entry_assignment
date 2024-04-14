package org.example.entryassignment.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
public record CommentResponse (
        Long postId,
        List<CommentListResponse> responseList
) {

    public static CommentResponse of(Long postId, List<CommentListResponse> responseList) {
        return CommentResponse.builder()
                .postId(postId)
                .responseList(responseList)
                .build();
//        return new CommentResponse(
//                postId,
//                responseList
//        );
    }

}
