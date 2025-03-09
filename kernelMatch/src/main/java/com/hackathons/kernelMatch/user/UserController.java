package com.hackathons.kernelMatch.user;

import com.hackathons.kernelMatch.user.dto.UserResponse;
import com.hackathons.kernelMatch.user.vo.UserRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("")
    public ResponseEntity<UserResponse> create(@RequestBody UserRequest userRequest) {
        return ResponseEntity.ok(userService.create(userRequest));
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserResponse> getOne(@PathVariable Long id) {

        return ResponseEntity.ok(userService.getOne(id));
    }

    @GetMapping("/all")
    public ResponseEntity<List<UserResponse>> getAll() {

        return ResponseEntity.ok(userService.getAll());
    }

    @PutMapping("/{id}")
    public ResponseEntity<UserResponse> update(@PathVariable Long id, @RequestBody UserRequest userRequest) {

        return ResponseEntity.ok(userService.update(id, userRequest));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<UserResponse> delete(@PathVariable Long id) {

        return ResponseEntity.ok(userService.delete(id));
    }
}



