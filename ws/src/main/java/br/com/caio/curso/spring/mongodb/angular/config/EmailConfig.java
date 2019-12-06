package br.com.caio.curso.spring.mongodb.angular.config;



import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import br.com.caio.curso.spring.mongodb.angular.services.email.EmailService;
import br.com.caio.curso.spring.mongodb.angular.services.email.SmtpEmailService;

@Configuration
@PropertySource("classpath:application.properties")
public class EmailConfig {

    @Bean
    public EmailService emailService(){
        return new SmtpEmailService();
    }
}
