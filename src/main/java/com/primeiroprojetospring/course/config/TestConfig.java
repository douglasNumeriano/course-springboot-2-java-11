package com.primeiroprojetospring.course.config;

import com.primeiroprojetospring.course.entities.User;
import com.primeiroprojetospring.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {//Classe auxilixar de condfiguração do perfil de teste

                                                      // Ela será utilizada quando estiver utilizando o perfil de teste
    @Autowired // usado para referenciar uma instancia do UserRepositiry ao TestConfig
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception { // este método executa uma função da classe "User no banco"

        User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
        User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");

        userRepository.saveAll(Arrays.asList(u1,u2)); // este método salva uma lista de objetos no banco de dados

    }
}
