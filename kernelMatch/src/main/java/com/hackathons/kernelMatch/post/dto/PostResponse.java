package com.hackathons.kernelMatch.post.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.hackathons.kernelMatch.post.PostEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonNaming(value = PropertyNamingStrategies.SnakeCaseStrategy.class)
public class PostResponse {

    private Long id;

    private Long userId;

    private String title;

    private String content;

    public static PostResponse toDto (PostEntity postEntity) {
        return PostResponse.builder()
                .id(postEntity.getId())
                .userId(postEntity.getUserId())
                .title(postEntity.getTitle())
                .content(postEntity.getContent())
                .build();
    }
}
