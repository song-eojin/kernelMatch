package com.hackathons.kernelMatch.user.vo;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.hackathons.kernelMatch.user.UserEntity;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonNaming(value = PropertyNamingStrategies.SnakeCaseStrategy.class)
public class UserRequest {

    @NotBlank
    private String name;

    @NotBlank
    @Email
    private String email;

    @NotBlank
    @Size(min = 6)
    @Pattern(regexp = "")
    private String password;

    @NotBlank
    @Pattern(regexp = "")
    private String phone;

    public static UserEntity toEntity(UserRequest userRequest) {
        return UserEntity.builder()
                .name(userRequest.getName())
                .email(userRequest.getEmail())
                .password(userRequest.getPassword())
                .phone(userRequest.getPhone())
                .build();
    }
}
