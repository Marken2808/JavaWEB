package com.tolo.testSpring.controllers;


import com.tolo.testSpring.entities.Post;
import com.tolo.testSpring.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("weather")
public class PostController {

    @Autowired
    private PostService postService;

    @GetMapping("/")
    public String forecast(){
        return "new value";
    }

    @GetMapping("/posts")
    public List<Post> posts() {
        return postService.getAllPost();
    }

    @PostMapping("/post")
    public void publishPost(@RequestBody Post post){

        if (post.getDate() == null) {
            post.setDate(new Date());
        }
        postService.insert(post);
    }

}
