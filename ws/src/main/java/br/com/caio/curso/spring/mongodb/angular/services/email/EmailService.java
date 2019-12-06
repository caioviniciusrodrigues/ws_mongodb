package br.com.caio.curso.spring.mongodb.angular.services.email;


import javax.mail.internet.MimeMessage;

import br.com.caio.curso.spring.mongodb.angular.domain.User;
import br.com.caio.curso.spring.mongodb.angular.domain.VerificationToken;

public interface EmailService {

    void sendHtmlEmail(MimeMessage msg);
    void sendConfirmationHtmlEmail(User user, VerificationToken vToken);
}
