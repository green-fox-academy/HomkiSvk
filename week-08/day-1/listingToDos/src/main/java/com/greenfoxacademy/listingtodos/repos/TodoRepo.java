package com.greenfoxacademy.listingtodos.repos;

import com.greenfoxacademy.listingtodos.models.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepo extends JpaRepository<Todo, Long> {
}
