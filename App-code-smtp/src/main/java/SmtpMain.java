import configurationData.ConfigurationManager;
import smtpLogic.Mail;
import smtpLogic.Person;
import smtpLogic.Prank;
import smtpLogic.PrankGenerator;
import protocolSmtp.SmtpClient;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class SmtpMain{


    public static void main(String [] args) {


        ConfigurationManager cm = new ConfigurationManager();
        SmtpClient client = new SmtpClient(cm.getServerAddress(), cm.getServerPort());

        try{


            PrankGenerator prankGenerator = new PrankGenerator(cm);

            List<Prank> pranks = prankGenerator.generatePranks();
            Mail mail;

            for(Prank prank : pranks){
                mail = prank.generateMail();
                client.sendMail(mail);
            }
        } catch (IOException ex){
            //LOG.severe(ex.getMessage());
        }


    }
}
