package org.suleiman.EmailService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.suleiman.EmailService.Service.EmailSenderService;

@SpringBootApplication
public class EmailServiceApplication {


	public static void main(String[] args) {
		SpringApplication.run(EmailServiceApplication.class, args);

		}


}
