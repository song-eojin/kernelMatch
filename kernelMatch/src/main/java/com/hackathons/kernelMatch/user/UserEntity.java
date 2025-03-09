package com.hackathons.kernelMatch.user;

import com.hackathons.kernelMatch.common.enums.UserRole;
import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity(name = "user")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String email;

    private String password;

    private String phone;

    @Enumerated(EnumType.STRING)
    private UserRole role;

    private boolean isActive;

    @Column(updatable = false)
    private LocalDateTime registeredAt;
}
