package com.hackathons.kernelMatch.post;

import com.hackathons.kernelMatch.post.dto.PostResponse;
import com.hackathons.kernelMatch.post.vo.PostRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/posts")
@RequiredArgsConstructor
public class PostController {
    
    private final PostService postService;

    @PostMapping("")
    public ResponseEntity<PostResponse> create(@RequestBody PostRequest PostRequest) {
        return ResponseEntity.ok(postService.create(PostRequest));
    }

    @GetMapping("/{id}")
    public ResponseEntity<PostResponse> getOne(@PathVariable Long id) {

        return ResponseEntity.ok(postService.getOne(id));
    }

    @GetMapping("/all")
    public ResponseEntity<List<PostResponse>> getAll() {

        return ResponseEntity.ok(postService.getAll());
    }

    @PutMapping("/{id}")
    public ResponseEntity<PostResponse> update(@PathVariable Long id, @RequestBody PostRequest PostRequest) {

        return ResponseEntity.ok(postService.update(id, PostRequest));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<PostResponse> delete(@PathVariable Long id) {

        return ResponseEntity.ok(postService.delete(id));
    }
}
