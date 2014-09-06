
package com.scheduler;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import java.util.Date;

 
public class TaskScheduler
{
   
    public void run()
    {
       
        final String username = "prat@iconext.co.th";
        final String password = "asdf_4568";

        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        //props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "www.iconext.co.th");
        props.put("mail.smtp.port", "25");

        Session session = Session.getInstance(props,
                new javax.mail.Authenticator() {
                    @Override
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(username, password);
                    }
                });

        try {
            session.setDebug(true);
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("prat@iconext.co.th"));
            //message.setRecipients(Message.RecipientType.TO,InternetAddress.parse("parkpoom@iconext.co.th,paitoon@iconext.co.th,alisa@iconext.co.th,ploypapas@iconext.co.th,darunee@iconext.co.th,usanee@iconext.co.th,prat@iconext.co.th,pratz.nud@gmail.com"));
            message.setRecipients(Message.RecipientType.TO,InternetAddress.parse("prat@iconext.co.th"));
            message.setSubject("Test");
            Multipart multipart = new MimeMultipart();
            MimeBodyPart mbp1 = new MimeBodyPart();
            
            new Date().toString();
            
            
            mbp1.setContent("<b>P</b>ratz: "+new Date().toString(), "text/html");
            multipart.addBodyPart(mbp1);
            //multipart.addBodyPart(messageBodyPart);
            message.setContent(multipart);
            Transport.send(message);
            System.out.println("Done");
            java.awt.Toolkit.getDefaultToolkit().beep(); 
        } catch (MessagingException e) {
            
            
        }
        //System.out.println("Method executed at every 5 seconds. Current time is :: "+ new Date());
    }
}
