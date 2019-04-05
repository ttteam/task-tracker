package com.example.demo.service;

import com.example.demo.model.Comment;

public interface CommentService {
    Comment saveComment(Comment comment);
    Comment getCommentById(String id);
    Iterable<Comment> getAllComments();
    void deleteComment(String id);
}
