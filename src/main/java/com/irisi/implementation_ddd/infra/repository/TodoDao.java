package com.irisi.implementation_ddd.infra.repository;


import com.irisi.implementation_ddd.infra.entity.Todo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class TodoDao implements com.irisi.implementation_ddd.domain.repository.TodoDao {
    private final SpringDataTodoDao springDataTodoDao;

    public TodoDao(SpringDataTodoDao springDataTodoDao) {
        this.springDataTodoDao = springDataTodoDao;
    }

    @Override
    public Todo save(Todo todo) {
        return springDataTodoDao.save(todo);
    }

    @Override
    public List<Todo> findAll() {
        return springDataTodoDao.findAll();
    }
}
