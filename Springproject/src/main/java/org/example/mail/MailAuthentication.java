package org.example.mail;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

public class MailAuthentication extends Authenticator{

    @Override
    protected PasswordAuthentication getPasswordAuthentication()
    {
        return new PasswordAuthentication(MailConstants.SENDER, MailConstants.APP_PASSWORD);

    }
}
