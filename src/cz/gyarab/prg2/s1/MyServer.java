package cz.gyarab.prg2.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class MyServer {
    public static void main(String[] args) throws IOException, InterruptedException {

        ServerSocket server = new ServerSocket(10000);

        Socket s = server.accept();

        BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
        System.out.println(in.readLine());

        s.close();





/*
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {

            try (ServerSocket server = new ServerSocket(10000)) {
                server.accept().close();
            } catch (IOException e) {
                System.out.println("chyba");
            }

            }
        });
        t2.start();

 */

        Thread.sleep(500);

/*
        for (int i = 0; i < 20; i++) {
            int finalI = i;
            Thread t = new Thread(() -> {
                String ip = finalI == 0 ? "127.0.0.1" : "192.168.82." + finalI;
                //System.out.println("oteviram " + ip);
                try (Socket s = new Socket(ip, 10000)) {
                    System.out.println("mohu se pripojit na " + ip);
                } catch (UnknownHostException e) {
                    throw new RuntimeException(e);
                } catch (IOException e) {
                    System.out.println("chyba " + ip);
                }
            });
            t.start();
        }


        System.out.println("aaaa");
        ServerSocket server = new ServerSocket(8090);
        System.out.println("bbb");
        Socket s = server.accept();
        System.out.println("ccc");
        s.close();

         */
    }
}
