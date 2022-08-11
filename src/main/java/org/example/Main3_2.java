package org.example;

import org.xml.sax.SAXException;


import javax.xml.*;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLStreamException;
import javax.xml.transform.TransformerException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

//import javax.MessagingException;
public class Main3_2 {
    public static void main(String[] args) throws ParserConfigurationException, IOException,SAXException, XMLStreamException, TransformerException, MalformedURLException {
        URLConnection connection = new URL("http://www.google.com").openConnection();
       Scanner scanner = new Scanner(connection.getInputStream());
while (scanner.hasNextLine()){
    System.out.println(scanner.nextLine());
}
        Map<String, List<String>> headers = connection.getHeaderFields();
        for (Map.Entry<String,List<String>> entry:headers.entrySet()) {
            System.out.println(entry.getKey()+"/"+entry.getValue());

        }
    }
}
