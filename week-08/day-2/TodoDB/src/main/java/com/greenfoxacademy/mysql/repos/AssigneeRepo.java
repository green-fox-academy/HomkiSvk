package com.greenfoxacademy.mysql.repos;

import com.greenfoxacademy.mysql.models.Assignee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AssigneeRepo extends JpaRepository<Assignee, Long> {



}
