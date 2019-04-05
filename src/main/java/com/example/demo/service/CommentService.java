package com.example.demo.service;

import com.example.demo.model.Comment;

import java.util.List;

public interface CommentService {
    Comment saveComment(Comment comment);
    Comment getCommentById(String id);
    List<Comment> getAllComments();
    void deleteComment(String id);
}
