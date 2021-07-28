package com.greenfoxacademy.mysql.repos;

import com.greenfoxacademy.mysql.models.Assignee;
import com.greenfoxacademy.mysql.models.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface AssigneeRepo extends JpaRepository<Assignee, Long> {

    Assignee getAssigneeByName(String name);

}
