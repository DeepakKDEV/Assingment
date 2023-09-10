package org.example;

import org.example.mail.MailHandlerBase;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {


        SpringApplication.run(Main.class,args);

        System.out.println("Starting to Send Mail..... ");

        MailHandlerBase mailHandler = new MailHandlerBase();
        mailHandler.sendMail();
    }
}
