package com.primeiroprojetospring.course.repositories;

import com.primeiroprojetospring.course.entities.Order;
import com.primeiroprojetospring.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

// Neste caso não seria necessario usar uma anotação aqui pois por estar herdando da classe "JpaRepository"
public interface OrderRepository extends JpaRepository<Order, Long> { // será uma interface (como se fosse o DAO do ERP do serviço)

}
