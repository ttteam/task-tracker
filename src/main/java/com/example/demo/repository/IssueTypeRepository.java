package com.example.demo.repository;

import com.example.demo.model.IssueType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IssueTypeRepository extends CrudRepository<IssueType, Long> {
    IssueType findIssueTypeById(Long id);
}
