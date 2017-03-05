/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
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
import javax.swing.JOptionPane;

/**
 *
 * @author Bhavesh Patel
 */
public class EmailSender {
    
    
    public static int sendEmail(String userFromEmail, String pass, String userToEmail,String u1,String u2,String m){
        final String username = userFromEmail;
		final String password = pass;

		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");

		Session session = Session.getInstance(props, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		  });

		try {

			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(userFromEmail));
			message.setRecipients(Message.RecipientType.TO,InternetAddress.parse(userToEmail));
			message.setSubject("Request");
                        
                        BodyPart bp = new MimeBodyPart();
                        
			bp.setText("Hello " + u2 + ", \n\n" + m + " \n\n Thanks, \n" + u1);
                        
                        Multipart mp = new MimeMultipart();
                        mp.addBodyPart(bp);
                        bp = new MimeBodyPart();
                        String filename = "Customer_details.xlsx";
                        DataSource source = new FileDataSource(filename);
                        bp.setDataHandler(new DataHandler(source));
                        bp.setFileName(filename);
                        mp.addBodyPart(bp);
                        message.setContent(mp);
                        
			Transport.send(message);

			JOptionPane.showMessageDialog(null, "Mail sent..");

		} catch (MessagingException e) {
			                 JOptionPane.showMessageDialog(null, "Authentication Failed - Mail not send");
                                         return 0;
                                         
		}
        return 1;
    }
    
}
