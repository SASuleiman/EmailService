package org.suleiman.EmailService.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.suleiman.EmailService.Service.EmailSenderService;

@RestController
@RequestMapping(value = "/emailService")
public class MailControllers {
    @Autowired
    private EmailSenderService emailSenderService;

    @Value("${RECEIVING_MAIL_ADDRESS}")
    private String receivingEmail;


    @PostMapping
    public void triggerEmail() {
        emailSenderService.sendSimpleEmail(receivingEmail,"Testing spring boot email service","Email Service");

    }

}
