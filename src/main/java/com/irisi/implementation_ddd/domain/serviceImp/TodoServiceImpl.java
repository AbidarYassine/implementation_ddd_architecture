package com.irisi.implementation_ddd.domain.serviceImp;

import com.irisi.implementation_ddd.domain.repository.TodoDao;
import com.irisi.implementation_ddd.domain.service.TodoService;
import com.irisi.implementation_ddd.infra.entity.Todo;

import java.util.List;

public class TodoServiceImpl implements TodoService {

    //    hadi (TodoDao) implementer par une class Annotated by @Service
    private final TodoDao todoDao;

    public TodoServiceImpl(TodoDao todoDao) {
        this.todoDao = todoDao;
    }

    @Override
    public Todo save(Todo order) {
        return todoDao.save(order);
    }

    @Override
    public List<Todo> findAll() {
        return todoDao.findAll();
    }
}
