package com.primeiroprojetospring.course.service;

import com.primeiroprojetospring.course.entities.Category;
import com.primeiroprojetospring.course.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service // esta anotação é para o spring reconhecer esta classe como um serviço da aplicação
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll(){
        return repository.findAll();
    }

    public Category findById(Long id){
        Optional<Category> obj = repository.findById(id);
        return obj.get();
    }
}
