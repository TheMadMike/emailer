package me.mgibas.emailer.email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import javax.validation.Valid;

@Service
public class EmailService {

    @Autowired
    private JavaMailSender mailSender;

    public void send(@Valid EmailMessage message) throws MailException {
        var simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setFrom(System.getenv("MAIL_USERNAME"));
        simpleMailMessage.setTo(message.getTo());
        simpleMailMessage.setSubject(message.getSubject() + " [from: " + message.getFrom() + "]");
        simpleMailMessage.setText(message.getContent());

        mailSender.send(simpleMailMessage);
    }
}
