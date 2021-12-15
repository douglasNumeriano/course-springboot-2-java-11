package com.primeiroprojetospring.course.service;

import com.primeiroprojetospring.course.entities.Product;
import com.primeiroprojetospring.course.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service // esta anotação é para o spring reconhecer esta classe como um serviço da aplicação
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public List<Product> findAll(){
        return repository.findAll();
    }

    public Product findById(Long id){
        Optional<Product> obj = repository.findById(id);
        return obj.get();
    }
}
