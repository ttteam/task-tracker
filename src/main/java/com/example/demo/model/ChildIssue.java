package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "childissue", schema = "new_schema")
@Getter
@Setter
public class ChildIssue {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String childIssueName;
    private String childIssueDescription;
    private Date childIssueStartDate;
    private Date childIssueDueDate;

    @ManyToOne(cascade = {
            CascadeType.REMOVE,
            CascadeType.MERGE
    })
    @JoinColumn(name = "childIssueStatus", referencedColumnName = "id")
    private IssueStatus issueStatus;

    public ChildIssue(){

    }

    public ChildIssue(String childIssueName, String childIssueDescription, Date childIssueStartDate, Date childIssueDueDate, IssueStatus issueStatus) {
        this.childIssueName = childIssueName;
        this.childIssueDescription = childIssueDescription;
        this.childIssueStartDate = childIssueStartDate;
        this.childIssueDueDate = childIssueDueDate;
        this.issueStatus = issueStatus;
    }
}
