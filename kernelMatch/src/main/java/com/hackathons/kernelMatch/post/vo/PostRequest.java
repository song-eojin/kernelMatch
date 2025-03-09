package com.hackathons.kernelMatch.post.vo;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.hackathons.kernelMatch.post.PostEntity;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonNaming(value = PropertyNamingStrategies.SnakeCaseStrategy.class)
public class PostRequest {

    @NotBlank
    private Long userId;

    @NotBlank
    private String title;

    @NotBlank
    private String content;

    public static PostEntity toEntity (PostRequest postRequest) {
        return PostEntity.builder()
                .userId(postRequest.getUserId())
                .title(postRequest.getTitle())
                .content(postRequest.getContent())
                .build();
    }
}
