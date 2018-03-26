package utility;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class SendEmail {
    public void sendMessage (String host, String user, String password, String to){
        //Get the session object
        Properties props = new Properties();
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        Session session = Session.getDefaultInstance(props,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(user, password);
                    }
                });
        try {
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(user));
            message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));
            message.setSubject("Build Installation Result Information");
            message.setText("Test Pass");
            //send the message
            Transport.send(message);
            System.out.println("message sent successfully...");
        } catch (MessagingException e) {e.printStackTrace();}
    }
}
