package com.spring.codeblog.utils;

import com.spring.codeblog.model.Post;
import com.spring.codeblog.repository.CodeBlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class DummyData {
    @Autowired
    CodeBlogRepository codeBlogRepository;
    @PostConstruct
    public void savePost(){
        List<Post> postList = new ArrayList<>();
        Post p1 = new Post("Erika", "tESTE", LocalDate.now(), "fghjkjfjhgsgbkjsmlhkdgydgwhbsjkxjsk,lmjhuhwdhb");
        postList.add(p1);
        Post p2 = new Post("Raissa", "tESTE1", LocalDate.now(), "fghjkjfjhgsgbkjsmlhkdgydgwhbsjkxjsk,lmjhuhwdhb");
        postList.add(p2);

        for (Post p : postList){
           Post postSaved = codeBlogRepository.save(p);
            System.out.println(postSaved.getId());
        }

    }
}
