package org.example;

import javax.imageio.IIOException;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketException;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        try (Socket socket = new Socket()) {
            socket.connect(new InetSocketAddress("google.com", 80), 2000);
            InputStream inStream = socket.getInputStream();
            Scanner in = new Scanner(System.in);
            while(in.hasNextLine()){
                String line = in.nextLine();
                System.out.println(line);
            }
        }catch (SocketException e){e.printStackTrace();}
        catch (IOException e){e.printStackTrace();}
    }
}
