package com.irisi.implementation_ddd.domain.repository;

import com.irisi.implementation_ddd.infra.entity.Todo;

import java.util.List;

public interface TodoDao {
    Todo save(Todo order);
    List<Todo> findAll();
}
