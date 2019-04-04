package com.example.demo.service;

import com.example.demo.model.Comment;

public interface CommentService {
    Comment saveComment(Comment comment);
    Comment getCommentById(Long id);
    Iterable<Comment> getAllComments();
    void deleteComment(Long id);
}
