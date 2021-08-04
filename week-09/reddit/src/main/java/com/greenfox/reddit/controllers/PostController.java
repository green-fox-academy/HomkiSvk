package com.greenfox.reddit.controllers;

import com.greenfox.reddit.models.Post;
import com.greenfox.reddit.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PostController {

    private final PostService postService;

    @Autowired
    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("/")
    public String indexPaged(Model model, @PageableDefault(size = 10) Pageable pageable) {
        model.addAttribute("page", postService.getAllOrderedAndPaginated(pageable));
        return "index";
    }

    @GetMapping("/submit")
    public String addNewPost() {
        return "addPost";
    }

    @PostMapping("/submit")
    public String postNewPost(@ModelAttribute Post post) {
        postService.addPost(post);
        return "redirect:/";
    }

    @GetMapping("/{id}/voteUp")
    public String voteUpOnPost(@PathVariable Long id) {
        postService.voteUpOnPost(id);
        return "redirect:/";
    }

    @GetMapping("/{id}/voteDown")
    public String voteDownOnPost(@PathVariable Long id) {
        postService.voteDownOnPost(id);
        return "redirect:/";
    }
}
