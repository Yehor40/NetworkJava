package org.example;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
//server socket
public class Main2 {
    public static void main(String[] args) throws IOException {
        try (ServerSocket serverSocket = new ServerSocket(8189);
             Socket socket = serverSocket.accept()) {
            Scanner sc = new Scanner(socket.getInputStream());
            PrintWriter writer = new PrintWriter(socket.getOutputStream(),true);

            while(sc.hasNextLine()){
                String str = sc.nextLine();
                writer.println("hello"+str);
                System.out.println(str);
                if(str.equals("exit")){break;}
            }
        }
    }
}
