package com.primeiroprojetospring.course.service;

import com.primeiroprojetospring.course.entities.Order;
import com.primeiroprojetospring.course.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service // esta anotação é para o spring reconhecer esta classe como um serviço da aplicação
public class OrderService {

    @Autowired
    private OrderRepository repository;

    public List<Order> findAll(){
        return repository.findAll();
    }

    public Order findById(Long id){
        Optional<Order> obj = repository.findById(id);
        return obj.get();
    }
}
