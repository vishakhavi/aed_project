/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Helper;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

/**
 *
 * @author Vishakha
 */
public class Email {
     public static void sendEmailMessage(String emailId, String subject, String text) {
        String toAddress = emailId;
        String fromAddress = "donotreplythriftshopers@gmail.com";
        String pass = "neuthrift";

        Properties properties = System.getProperties();
        String host = "smtp.gmail.com";

        properties.put("mail.smtp.starttls.enable", "true");

        properties.put("mail.smtp.ssl.trust", host);
        properties.put("mail.smtp.user", fromAddress);
        properties.put("mail.smtp.port", "587");
        properties.put("mail.smtp.auth", "true");

        Session session = Session.getDefaultInstance(properties);

        try {
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(fromAddress));
            message.addRecipients(Message.RecipientType.TO, InternetAddress.parse(toAddress));
            message.setSubject(subject);
            message.setText(text);
            Transport transport = session.getTransport("smtp");
            transport.connect(host, fromAddress, pass);
            transport.sendMessage(message, message.getAllRecipients());
            transport.close();
            System.out.println("Email message sent");
        } catch (MessagingException ex) {
            System.err.println("MessagingException"+ex.getMessage());
            JOptionPane.showMessageDialog(null, "Invalid email id");
        }
    }
    
}
