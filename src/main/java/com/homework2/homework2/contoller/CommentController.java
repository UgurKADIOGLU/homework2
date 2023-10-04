package com.homework2.homework2.contoller;

import com.homework2.homework2.dto.CommentSaveRequest;
import com.homework2.homework2.dto.CommentSaveResponse;
import com.homework2.homework2.entities.Comment;
import com.homework2.homework2.services.CommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/comments")
public class CommentController {
    private final CommentService commentService;
    @GetMapping("{id}")
    public List<Comment> findAllByUser_Id(@RequestParam Long id){
        return commentService.findAllByUser_Id(id);
    }
    @GetMapping("product/{id}")
    public List<Comment> findAllByProduct_Id(@RequestParam Long id){
        return commentService.findAllByProduct_Id(id);
    }
    @PostMapping
    public CommentSaveResponse save(CommentSaveRequest commentSaveRequest){
        return commentService.save(commentSaveRequest);
    }
    @DeleteMapping("/delete/{id}")
    private void delete(Long id){
        commentService.delete(id);
    }
}
