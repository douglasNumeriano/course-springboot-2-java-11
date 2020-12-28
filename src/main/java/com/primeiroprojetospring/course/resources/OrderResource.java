package com.primeiroprojetospring.course.resources;


import com.primeiroprojetospring.course.entities.Order;
import com.primeiroprojetospring.course.entities.User;
import com.primeiroprojetospring.course.service.OrderService;
import com.primeiroprojetospring.course.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/orders")
public class OrderResource { // Recursos da entidade  User

    @Autowired
    private OrderService service;

    @GetMapping
    public ResponseEntity<List<Order>> findAll(){
        List<Order> lista = service.findAll();
        return ResponseEntity.ok().body(lista);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Order> findById(@PathVariable Long id){ // este "@PathVariable" é utilizado para o spring reconhecer o parametro que esta sendo passado
        Order obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}
