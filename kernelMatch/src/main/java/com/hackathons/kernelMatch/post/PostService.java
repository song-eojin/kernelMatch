package com.hackathons.kernelMatch.post;

import com.hackathons.kernelMatch.post.dto.PostResponse;
import com.hackathons.kernelMatch.post.vo.PostRequest;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PostService {

    private final PostRepository postRepository;

    public PostResponse create(PostRequest postRequest) {

        var entity = postRepository.save(PostRequest.toEntity(postRequest));

        return PostResponse.toDto(entity);
    }

    public PostResponse getOne(Long id) {

        var entity = postRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException());

        return PostResponse.toDto(entity);
    }

    public List<PostResponse> getAll() {

        return postRepository.findAll()
                .stream().map(PostResponse::toDto).toList();
    }

    public PostResponse update(Long id, PostRequest postRequest) {

        var entity = postRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException());

        postRepository.save(PostRequest.toEntity(postRequest));

        return PostResponse.toDto(entity);
    }

    public PostResponse delete(Long id) {

        var entity = postRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException());

        return PostResponse.toDto(entity);
    }
}
