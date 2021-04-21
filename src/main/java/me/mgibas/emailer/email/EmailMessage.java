package me.mgibas.emailer.email;

import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

@Validated
public class EmailMessage implements Serializable {
    @Email(message = "Email should be valid")
    private String from;

    @Email(message = "Email should be valid")
    private String to;

    @NotEmpty(message = "Subject shouldn't be empty")
    private String subject;

    @NotEmpty(message = "Content shouldn't be empty")
    private String content;

    public EmailMessage(String from, @Email(message = "Email should be valid") String to, @NotEmpty(message = "Subject shouldn't be empty") String subject, String content) {
        this.from = from;
        this.to = to;
        this.subject = subject;
        this.content = content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContent() {
        return content;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public String getSubject() {
        return subject;
    }

    @Override
    public String toString() {
        return "Email{" +
                "from='" + from + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
