package com.hackathons.kernelMatch.user;

import com.hackathons.kernelMatch.user.dto.UserResponse;
import com.hackathons.kernelMatch.user.vo.UserRequest;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public UserResponse create(UserRequest userRequest) {

        var entity = userRepository.save(UserRequest.toEntity(userRequest));

        return UserResponse.toDto(entity);
    }

    public UserResponse getOne(Long id) {

        var entity = userRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException());

        return UserResponse.toDto(entity);
    }

    public List<UserResponse> getAll() {

        return userRepository.findAll()
                .stream().map(UserResponse::toDto).toList();
    }

    public UserResponse update(Long id, UserRequest userRequest) {

        var entity = userRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException());

        userRepository.save(UserRequest.toEntity(userRequest));

        return UserResponse.toDto(entity);
    }

    public UserResponse delete(Long id) {

        var entity = userRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException());

        return UserResponse.toDto(entity);
    }
}
