package com.greenfox.reddit.services;

import com.greenfox.reddit.models.Post;
import com.greenfox.reddit.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


@Service
public class PostService {

    private final PostRepository postRepository;

    @Autowired
    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }


    public Page<Post> getAllOrderedAndPaginated(Pageable pageable) {
        return postRepository.findAllByOrderByVoteValueDesc(pageable);
    }

    public void addPost(Post post) {
        postRepository.save(post);
    }

    public void voteUpOnPost(Long id) {
        Post temp = postRepository.getById(id);
        temp.setVoteValue(temp.getVoteValue() + 1);
        postRepository.save(temp);
    }

    public void voteDownOnPost(Long id) {
        Post temp = postRepository.getById(id);
        temp.setVoteValue(temp.getVoteValue() - 1);
        postRepository.save(temp);
    }

}
