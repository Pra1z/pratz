package iconextmail;

import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
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

public class ICONEXTMAIL {

    public static void main(String[] args) throws InterruptedException {

        final String username = "prat@iconext.co.th";
        final String password = "XXXXXXXXX";

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

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("prat@iconext.co.th"));
            message.setRecipients(Message.RecipientType.TO,InternetAddress.parse("parkpoom@iconext.co.th,paitoon@iconext.co.th,alisa@iconext.co.th,ploypapas@iconext.co.th,darunee@iconext.co.th,usanee@iconext.co.th,prat@iconext.co.th,pratz.nud@gmail.com"));
            //message.setRecipients(Message.RecipientType.TO,InternetAddress.parse("prat@iconext.co.th,pratz.nud@gmail.com"));
            message.setSubject("Task Tracking Report 2014_Pratz");
            MimeBodyPart messageBodyPart = new MimeBodyPart();
            Multipart multipart = new MimeMultipart();
            messageBodyPart = new MimeBodyPart();
            String file = "C:\\Users\\prat\\Google Drive\\Task Tracking Report 2014_Mr.Prat.xls";
            String fileName = "Task Tracking Report 2014_Mr.Prat.xls";
            DataSource source = new FileDataSource(file);
            messageBodyPart.setDataHandler(new DataHandler(source));
            messageBodyPart.setFileName(fileName);
            MimeBodyPart mbp1 = new MimeBodyPart();
            mbp1.setText("-- \n"
                    + "Best Regards,\n"
                    + "Prat Nudklin\n"
                    + "Senior System Developer\n"
                    + "Mobile: 086-722-4100");
            multipart.addBodyPart(mbp1);
            multipart.addBodyPart(messageBodyPart);
            message.setContent(multipart);
            Transport.send(message);
            System.out.println("Done");
            java.awt.Toolkit.getDefaultToolkit().beep(); 
        } catch (MessagingException e) {
            
            java.awt.Toolkit.getDefaultToolkit().beep(); 
            Thread.sleep(1000);
            java.awt.Toolkit.getDefaultToolkit().beep(); 
            Thread.sleep(1000);
            java.awt.Toolkit.getDefaultToolkit().beep(); 
            Thread.sleep(1000);
        }
    }
}
