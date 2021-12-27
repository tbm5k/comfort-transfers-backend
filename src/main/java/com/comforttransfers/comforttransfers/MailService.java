package com.comforttransfers.comforttransfers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class MailService {

    @Autowired
    private JavaMailSender mailSender;

    public Email sendEmail(Email email) {

        SimpleMailMessage mailMessage = new SimpleMailMessage();
        mailMessage.setTo("comforttransfers001@gmail.com");
        mailMessage.setSubject("Inquiry");
        mailMessage.setText("From : " + email.getFrom() + "\n \n" + email.getMessage());

        mailSender.send(mailMessage);
        return email;
    }
}
