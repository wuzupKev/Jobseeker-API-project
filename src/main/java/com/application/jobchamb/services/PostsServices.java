package com.application.jobchamb.services;

import com.application.jobchamb.entities.Posts;
import com.application.jobchamb.repositories.PostsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostsServices {

    @Autowired
    PostsRepository postsRepository;

    public List<Posts> viewAllPosts(){
        return postsRepository.findAll();
    }

    public Optional<Posts> viewSinglePost(int id){
        return postsRepository.findById(id);
    }

    public void createSavePost(Posts posts){
        postsRepository.save(posts);
    }

}
