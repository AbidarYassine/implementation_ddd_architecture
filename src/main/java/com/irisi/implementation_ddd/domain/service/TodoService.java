package com.irisi.implementation_ddd.domain.service;

import com.irisi.implementation_ddd.infra.entity.Todo;

import java.util.List;

public interface TodoService {
    Todo save(Todo order);

    List<Todo> findAll();
}
