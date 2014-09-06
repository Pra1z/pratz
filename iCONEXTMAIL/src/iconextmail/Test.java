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

public class Test {

    public static void main(String[] args) throws InterruptedException {

        final String username = "prat@iconext.co.th";
        final String password = "XXXXXXX";

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
            message.setRecipients(Message.RecipientType.TO,InternetAddress.parse("prat@iconext.co.th,pasuwat@iconext.co.th"));
            message.setSubject("Test");
            MimeBodyPart messageBodyPart = new MimeBodyPart();
            Multipart multipart = new MimeMultipart();
            messageBodyPart = new MimeBodyPart();
            String file = "C:\\Users\\prat\\Google Drive\\Task Tracking Report 2014_Mr.Prat.xls";
            String fileName = "Task Tracking Report 2014_Mr.Prat.xls";
            DataSource source = new FileDataSource(file);
            messageBodyPart.setDataHandler(new DataHandler(source));
            messageBodyPart.setFileName(fileName);
            MimeBodyPart mbp1 = new MimeBodyPart();
            mbp1.setContent("  <table style=\"border-collapse:\n" +
" collapse;table-layout:fixed;width:634pt\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\" width=\"845\">\n" +
" <colgroup><col style=\"mso-width-source:userset;mso-width-alt:6944;width:163pt\" width=\"217\">\n" +
" <col style=\"mso-width-source:userset;mso-width-alt:5856;width:137pt\" width=\"183\">\n" +
" <col style=\"mso-width-source:userset;mso-width-alt:5792;width:136pt\" width=\"181\">\n" +
" <col style=\"width:66pt\" span=\"3\" width=\"88\">\n" +
" </colgroup><tbody>\n" +
"    <tr height=21 style=height:15.75pt>\n" +
"        <td height=21 style=height:15.75pt>Dear Sir/Madame,</td>\n" +
"    </tr>\n" +
"    <tr height=21 style=height:15.75pt>\n" +
"        <td height=21 style=height:15.75pt></td>\n" +
"    </tr>\n" +
"    <tr height=21 style=height:15.75pt>\n" +
"        <td height=21 colspan=3 style=height:15.75pt>Please be informed that the submitted price as follow is rejected by (STEFAN PUN) on on 26-Jun-2014:</td>\n" +
"    </tr>\n" +
"    <tr height=21 style=height:15.75pt>\n" +
"        <td height=21 style=height:15.75pt></td>\n" +
"    </tr>\n" +
"	</tbody>\n" +
"</table>\n" +
" \n" +
" <table  width=\"400\" border=\"1\">\n" +
" <tr>\n" +
"  <td width=\"250\"><b>Details</b></td>\n" +
"  <td width=\"150\"><b>Supplier<b></b></b></td>\n" +
" </tr>\n" +
" <tr>\n" +
"  <td>Name</td>\n" +
"  <td>{0}</td>\n" +
" </tr>\n" +
" <tr>\n" +
"  <td>Group</td>\n" +
"  <td>{2}</td>\n" +
" </tr>\n" +
" <tr>\n" +
"  <td>DIAS\n" +
"  Suplier &amp; Customer Code</td>\n" +
"  <td>{4}</td>\n" +
" </tr>\n" +
" <tr>\n" +
"  <td>Exporter\n" +
"  Customer Code</td>\n" +
"  <td>-</td>\n" +
" </tr>\n" +
" <tr>\n" +
"  <td>Importer\n" +
"  Vendor Code</td>\n" +
"  <td>{7}</td>\n" +
" </tr>\n" +
"</table>\n" +
" <table style=\"border-collapse:\n" +
" collapse;table-layout:fixed;width:634pt\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\" width=\"845\">\n" +
" <colgroup><col style=\"mso-width-source:userset;mso-width-alt:6944;width:163pt\" width=\"217\">\n" +
" <col style=\"mso-width-source:userset;mso-width-alt:5856;width:137pt\" width=\"183\">\n" +
" <col style=\"mso-width-source:userset;mso-width-alt:5792;width:136pt\" width=\"181\">\n" +
" <col style=\"width:66pt\" span=\"3\" width=\"88\">\n" +
" </colgroup><tbody><tr style=\"height:15.75pt\" height=\"21\">\n" +
"  <td style=\"height:15.75pt\" height=\"21\"></td>\n" +
" </tr>\n" +
" <tr style=\"height:15.75pt\" height=\"21\">\n" +
"  <td style=\"height:15.75pt\" height=\"21\"><b>Product Description:</b></td>\n" +
" </tr>\n" +
" <tr style=\"height:15.75pt\" height=\"21\">\n" +
"  <td style=\"height:15.75pt\" height=\"21\">Part Number:<span style=\"mso-spacerun:yes\">&nbsp;</span></td>\n" +
"  <td>Testxas</td>\n" +
"  <td></td>\n" +
" </tr>\n" +
" <tr style=\"height:15.75pt\" height=\"21\">\n" +
"  <td style=\"height:15.75pt\" height=\"21\">Customer Part Number:</td>\n" +
"  <td>Testxas</td>\n" +
" </tr>\n" +
" <tr style=\"height:15.75pt\" height=\"21\">\n" +
"  <td style=\"height:15.75pt\" height=\"21\">Product Description:</td>\n" +
"  <td>Testxas</td>\n" +
" </tr>\n" +
" <tr style=\"height:15.75pt\" height=\"21\">\n" +
"  <td style=\"height:15.75pt\" height=\"21\">Item Class:</td>\n" +
"  <td>Test</td>\n" +
" </tr>\n" +
" <tr style=\"height:15.75pt\" height=\"21\">\n" +
"  <td style=\"height:15.75pt\" height=\"21\"></td>\n" +
" </tr>\n" +
" <tr style=\"height:15.75pt\" height=\"21\">\n" +
"  <td style=\"height:15.75pt\" height=\"21\"><b>Pricing Details:</b></td>\n" +
" </tr>\n" +
" <tr style=\"height:15.75pt\" height=\"21\">\n" +
"  <td style=\"height:15.75pt\" height=\"21\">Supplier Selling Price:</td>\n" +
"  <td>10.00</td>\n" +
" </tr>\n" +
" <tr style=\"height:15.75pt\" height=\"21\">\n" +
"  <td style=\"height:15.75pt\" height=\"21\">Profit Ratio</td>\n" +
"  <td>N/A</td>\n" +
" </tr>\n" +
" <tr style=\"height:15.75pt\" height=\"21\">\n" +
"  <td style=\"height:15.75pt\" height=\"21\">Freight &amp; Insurance\n" +
"  (%)</td>\n" +
"  <td>N/A</td>\n" +
" </tr>\n" +
" <tr style=\"height:15.75pt\" height=\"21\">\n" +
"  <td style=\"height:15.75pt\" height=\"21\">SGA Factor (%)</td>\n" +
"  <td>2.0</td>\n" +
" </tr>\n" +
" <tr style=\"height:15.75pt\" height=\"21\">\n" +
"  <td style=\"height:15.75pt\" height=\"21\">Currency Rate:</td>\n" +
"  <td>1.14 (AUD to THB)</td>\n" +
" </tr>\n" +
" <tr style=\"height:15.75pt\" height=\"21\">\n" +
"  <td style=\"height:15.75pt\" height=\"21\">Pricing Method:</td>\n" +
"  <td>Cost Plus</td>\n" +
" </tr>\n" +
" <tr style=\"height:15.75pt\" height=\"21\">\n" +
"  <td style=\"height:15.75pt\" height=\"21\">Usage:</td>\n" +
"  <td>AM</td>\n" +
" </tr>\n" +
" <tr style=\"height:18.75pt\" height=\"25\">\n" +
"   <td class=\"xl6410875\" style=\"height:18.75pt\" height=\"25\"><b>Customer Buying Price</b></td>\n" +
"  <td class=\"xl6410875\"><b>THB 435.90</b></td>\n" +
" </tr>\n" +
" <tr style=\"height:15.75pt\" height=\"21\">\n" +
"  <td style=\"height:15.75pt\" height=\"21\">Price Effective from :</td>\n" +
"  <td class=\"xl6910875\">28-Jun-2014</td>\n" +
" </tr>\n" +
" <tr style=\"height:15.75pt\" height=\"21\">\n" +
"  <td style=\"height:15.75pt\" height=\"21\"></td>\n" +
" </tr>\n" +
" <tr style=\"height:15.75pt\" height=\"21\">\n" +
"  <td colspan=\"3\" style=\"height:15.75pt\" height=\"21\">Please approve\n" +
"  the customer buying price via <a href=\"http://apal.xxx.com\">IGTS-System</a></td>\n" +
" </tr>\n" +
" <tr style=\"height:15.75pt\" height=\"21\">\n" +
"  <td style=\"height:15.75pt\" height=\"21\"></td>\n" +
" </tr>\n" +
" <tr style=\"height:15.75pt\" height=\"21\">\n" +
"  <td style=\"height:15.75pt\" height=\"21\">Thank you.</td>\n" +
" </tr>\n" +
" <tr style=\"height:15.75pt\" height=\"21\">\n" +
"  <td style=\"height:15.75pt\" height=\"21\"></td>\n" +
" </tr>\n" +
" <tr style=\"height:15.75pt\" height=\"21\">\n" +
"  <td style=\"height:15.75pt\" height=\"21\">Best Regards,</td>\n" +
" </tr>\n" +
" <tr style=\"height:15.75pt\" height=\"21\">\n" +
"  <td style=\"height:15.75pt\" height=\"21\">ISABELLA NG</td>\n" +
" </tr>\n" +
" <tr style=\"height:15.75pt\" height=\"21\">\n" +
"  <td style=\"height:15.75pt\" height=\"21\">(ISABELLA@denso.com.sg)</td>\n" +
" </tr>\n" +
" <!--[if supportMisalignedColumns]-->\n" +
" <tr style=\"display:none\" height=\"0\">\n" +
"  <td style=\"width:163pt\" width=\"217\"></td>\n" +
"  <td style=\"width:137pt\" width=\"183\"></td>\n" +
"  <td style=\"width:136pt\" width=\"181\"></td>\n" +
"  <td style=\"width:66pt\" width=\"88\"></td>\n" +
"  <td style=\"width:66pt\" width=\"88\"></td>\n" +
"  <td style=\"width:66pt\" width=\"88\"></td>\n" +
" </tr>\n" +
" <!--[endif]-->\n" +
"</tbody></table>\n" +
" ", "text/html");
            multipart.addBodyPart(mbp1);
            //multipart.addBodyPart(messageBodyPart);
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
