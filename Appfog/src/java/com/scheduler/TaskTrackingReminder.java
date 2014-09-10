package com.scheduler;

import java.awt.Toolkit;
import java.util.Date;
import java.util.Properties;
import javax.mail.Authenticator;
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

public class TaskTrackingReminder
{
  public void run()
  {
    String username = "prat@iconext.co.th";
    String password = "asdf_4568";
    
    Properties props = new Properties();
    props.put("mail.smtp.auth", "true");
    
    props.put("mail.smtp.host", "www.iconext.co.th");
    props.put("mail.smtp.port", "25");
    Session session = Session.getInstance(props, new Authenticator()
    {
      protected PasswordAuthentication getPasswordAuthentication()
      {
        return new PasswordAuthentication("prat@iconext.co.th", "asdf_4568");
      }
    });
    try
    {
      session.setDebug(true);
      Message message = new MimeMessage(session);
      message.setFrom(new InternetAddress("prat@iconext.co.th"));
      
      message.setRecipients(Message.RecipientType.TO, InternetAddress.parse("prat@iconext.co.th"));
      message.setSubject("Reminder: Weekly Task Tracking Report");
      Multipart multipart = new MimeMultipart();
      MimeBodyPart mbp1 = new MimeBodyPart();
      
      new Date().toString();
      
      mbp1.setContent("Please, submit your <b>Task Tracking Report</b>", "text/html");
      multipart.addBodyPart(mbp1);
      
      message.setContent(multipart);
      Transport.send(message);
      System.out.println("Done");
      Toolkit.getDefaultToolkit().beep();
    }
    catch (MessagingException e) {}
  }
}
