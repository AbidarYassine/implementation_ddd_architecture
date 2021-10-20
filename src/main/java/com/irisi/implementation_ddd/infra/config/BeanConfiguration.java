package com.irisi.implementation_ddd.infra.config;

import com.irisi.implementation_ddd.domain.repository.TodoDao;
import com.irisi.implementation_ddd.domain.service.TodoService;
import com.irisi.implementation_ddd.domain.serviceImp.TodoServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {
    @Bean
    TodoService todoService(final TodoDao todoDao) {
        return new TodoServiceImpl(todoDao);
    }
}
