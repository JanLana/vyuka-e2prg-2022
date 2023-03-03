package cz.gyarab.prg2.s2;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class WebovyServer {
    public static void main(String[] args) throws IOException {
        System.out.println("start");

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");


        ServerSocket server = new ServerSocket(10000);

        System.out.println("krok 1");

        try (Socket socket = server.accept()) {
            System.out.println("krok 2");

            try (PrintWriter out = new PrintWriter(socket.getOutputStream(), true)) {
                out.println("HTTP/1.0 200");
                out.println();
                LocalDateTime now = LocalDateTime.now();
                out.println(dtf.format(now));
            }
        }

        System.out.println("hotovo");
    }
}
