package br.com.caio.curso.spring.mongodb.angular.repository;


import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.caio.curso.spring.mongodb.angular.domain.User;
import br.com.caio.curso.spring.mongodb.angular.domain.VerificationToken;

@Repository
public interface VerificationTokenRepository extends MongoRepository<VerificationToken, String> {

    Optional<VerificationToken> findByToken(String token);

    Optional<VerificationToken> findByUser(User user);
}
