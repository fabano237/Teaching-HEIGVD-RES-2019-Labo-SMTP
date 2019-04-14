package protocolSmtp;

import smtpLogic.Mail;

import java.io.IOException;

public interface SmtpClientInterface {
    public void sendMail(Mail mail) throws IOException;
}