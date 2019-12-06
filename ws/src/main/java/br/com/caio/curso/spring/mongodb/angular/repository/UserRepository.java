package br.com.caio.curso.spring.mongodb.angular.repository;


import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.caio.curso.spring.mongodb.angular.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User,String> {

    Optional<User> findByEmail (String email);

}
