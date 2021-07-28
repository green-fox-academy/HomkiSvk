package com.greenfoxacademy.mysql.repos;

import com.greenfoxacademy.mysql.models.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface TodoRepo extends JpaRepository<Todo, Long> {

    List<Todo> findAllByDone(Boolean done);
    List<Todo> findAllByDescriptionContainsOrTitleContains(String description, String title);
    List<Todo> findAllByCreationDateOrDueDateBefore(Date creDate, String date);

}