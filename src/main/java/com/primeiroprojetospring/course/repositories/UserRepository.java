package com.primeiroprojetospring.course.repositories;

import com.primeiroprojetospring.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> { // será uma interface (como se fosse o DAO do ERP do serviço)

}
