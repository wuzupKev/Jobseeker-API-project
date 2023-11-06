package com.application.jobchamb.controllers;

import com.application.jobchamb.entities.Posts;
import com.application.jobchamb.services.PostsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/posts")
public class PostsController {

    @Autowired
    private final PostsServices postsServices;

    public PostsController(PostsServices postsServices) {
        this.postsServices = postsServices;
    }

    @GetMapping
    public List<Posts> seeAllPosts(){
        return postsServices.viewAllPosts();
    }

    @GetMapping(path = "/{id}")
    public Optional<Posts> seeSinglePost(int id){
        return postsServices.viewSinglePost(id);
    }

    @PostMapping
    public void createUptadtePosts(Posts posts){
        postsServices.createSavePost(posts);
    }
}
