package com.hackathons.kernelMatch.user.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.hackathons.kernelMatch.common.enums.UserRole;
import com.hackathons.kernelMatch.user.UserEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonNaming(value = PropertyNamingStrategies.SnakeCaseStrategy.class)
public class UserResponse {

    private Long id;

    private String name;

    private String email;

    private String password;

    private String phone;

    private UserRole role;

    private boolean isActive;

    private LocalDateTime registeredAt;

    public static UserResponse toDto(UserEntity userEntity) {
        return UserResponse.builder()
                .id(userEntity.getId())
                .name(userEntity.getName())
                .email(userEntity.getEmail())
                .password(userEntity.getPassword())
                .phone(userEntity.getPhone())
                .role(userEntity.getRole())
                .isActive(userEntity.isActive())
                .registeredAt(userEntity.getRegisteredAt())
                .build();
    }
}
