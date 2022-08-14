package org.example;

import org.xml.sax.SAXException;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;

import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLStreamException;
import javax.xml.transform.TransformerException;
import java.io.IOException;
import java.util.Properties;
public class Main4 {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException, XMLStreamException, TransformerException, MessagingException {
        final Properties properties = new Properties();
        properties.load(Main4.class.getClassLoader().getResourceAsStream("mail.properties"));
        Session session = Session.getDefaultInstance(properties);
        MimeMessage message = new MimeMessage(session);
        message.setFrom(new InternetAddress("yourmail"));
        message.addRecipient(Message.RecipientType.TO,new InternetAddress("Yourmail@gmail.com"));
        message.setSubject("chinazes");
        message.setText("Message sent via java console application");
        Transport tr = session.getTransport();
        tr.connect(null,"Your password");
        tr.sendMessage(message, message.getAllRecipients());
        tr.close();

    }
}
