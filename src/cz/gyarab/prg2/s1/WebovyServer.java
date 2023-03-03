package cz.gyarab.prg2.s1;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class WebovyServer {
    public static void main(String[] args) throws IOException {
        System.out.println("start");
        ServerSocket server = new ServerSocket(10000);

        System.out.println("krok 1");
        Socket socket = server.accept();

        System.out.println("krok 2");
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);


        out.println("HTTP/1.0 200");
        out.println();
        out.println("ahoj");

        socket.close();
        System.out.println("hotovo");
    }
}
