package com.example.demo.repository;

import com.example.demo.model.Issue;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IssueRepository extends CrudRepository<Issue, Long> {
    Issue findIssueById(Long id);
}
