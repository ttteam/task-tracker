package com.example.demo.service.impl;

import com.example.demo.model.Comment;
import com.example.demo.repository.CommentRepository;
import com.example.demo.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentServiceImpl implements CommentService {

    private CommentRepository repository;

    @Autowired
    public CommentServiceImpl(CommentRepository repository) {
        this.repository = repository;
    }

    @Override
    public Comment saveComment(Comment comment) {
        return repository.save(comment);
    }

    @Override
    public Comment getCommentById(Long id) {
        return repository.findCommentById(id);
    }

    @Override
    public Iterable<Comment> getAllComments() {
        return repository.findAll();
    }

    @Override
    public void deleteComment(Long id) {
        repository.deleteById(id);
    }
}
