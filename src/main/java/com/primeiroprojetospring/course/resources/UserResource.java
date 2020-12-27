package com.primeiroprojetospring.course.resources;


import com.primeiroprojetospring.course.entities.User;
import com.primeiroprojetospring.course.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserResource { // Recursos da entidade  User

    @Autowired
    private UserService service;

    @GetMapping
    public ResponseEntity<List<User>> findAll(){
        List<User> lista = service.findAll();
        return ResponseEntity.ok().body(lista);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<User> findById(@PathVariable Long id){ // este "@PathVariable" é utilizado para o spring reconhecer o parametro que esta sendo passado
        User obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}
