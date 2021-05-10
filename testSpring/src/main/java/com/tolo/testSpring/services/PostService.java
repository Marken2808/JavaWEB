package com.tolo.testSpring.services;

import com.tolo.testSpring.entities.Post;
import com.tolo.testSpring.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;

    public List<Post> getAllPost(){
        return postRepository.findAll();
    }

    public void insert(Post post) {
        postRepository.save(post);
    }


}
