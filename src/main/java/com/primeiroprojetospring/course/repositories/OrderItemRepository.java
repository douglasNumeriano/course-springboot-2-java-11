package com.primeiroprojetospring.course.repositories;

import com.primeiroprojetospring.course.entities.Order;
import com.primeiroprojetospring.course.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

// Neste caso não seria necessario usar uma anotação aqui pois por estar herdando da classe "JpaRepository"
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> { // será uma interface (como se fosse o DAO do ERP do serviço)

}
