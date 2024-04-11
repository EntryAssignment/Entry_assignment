package org.example.entryassignment.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class
CommentResponse {
    private Long postId;
    private List<CommentListResponse> responseList;
}
