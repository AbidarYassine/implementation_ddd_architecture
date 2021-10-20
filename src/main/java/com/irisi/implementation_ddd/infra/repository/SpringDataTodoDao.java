package com.irisi.implementation_ddd.infra.repository;

import com.irisi.implementation_ddd.infra.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpringDataTodoDao extends JpaRepository<Todo, Long> {
}
