package com.primeiroprojetospring.course.resources;


import com.primeiroprojetospring.course.entities.Product;
import com.primeiroprojetospring.course.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/products")
public class ProductResource { // Recursos da entidade  User

    @Autowired
    private ProductService service;

    @GetMapping
    public ResponseEntity<List<Product>> findAll(){
        List<Product> lista = service.findAll();
        return ResponseEntity.ok().body(lista);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Product> findById(@PathVariable Long id){ // este "@PathVariable" é utilizado para o spring reconhecer o parametro que esta sendo passado
        Product obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}
