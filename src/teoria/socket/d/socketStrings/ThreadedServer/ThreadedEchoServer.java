package teoria.socket.d.socketStrings.ThreadedServer; /**
 * @author Cay Horstmann
 * @version 1.20 2004-08-03
 * modificata...
 */

import java.io.*;
import java.net.*;
import java.util.*;

/**
 This program implements a multithreaded server that listens to port 8189 and echoes back
 all client input.
 */
public class ThreadedEchoServer {
    public static void main(String[] args) {
        System.out.println("Finestra del server: ");
        try {
            int i = 1;
            ServerSocket s = new ServerSocket(8189);

            while (true) {
                Socket incoming = s.accept(); // si mette in attesa di richiesta di connessione e la apre
                System.out.println("Spawning " + i);
                Runnable r = new ThreadedEchoHandler(incoming, i);
                new Thread(r).start();
                i++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

