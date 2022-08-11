package org.example;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLStreamException;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)throws ParserConfigurationException, IOException,SAXException, XMLStreamException {
            try(Socket socket = new Socket()) {
                socket.connect(new InetSocketAddress("localhost",8189),2000);
                Scanner sc = new Scanner(socket.getInputStream());
                while(sc.hasNextLine()){
                    System.out.println(sc.nextLine());
                }
            }
        System.out.println("Hello world!");
    }
}