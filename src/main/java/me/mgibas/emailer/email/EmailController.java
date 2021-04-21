package me.mgibas.emailer.email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1")
public class EmailController {

    private final EmailService emailService;

    @Autowired
    public EmailController(EmailService emailService) {
        this.emailService = emailService;
    }

    @PostMapping(path = "/send")
    public String sendEmail(@Valid @RequestBody final EmailMessage message) {
        emailService.send(message);
        return "Yay! Email sent!";
    }
}
