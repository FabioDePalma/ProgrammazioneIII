package teoria.socket.d.socketStrings.ThreadedServer;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * This class handles the client input for one server socket connection.
 */
class ThreadedEchoHandler implements Runnable {

    private Socket incoming;
    private int counter;

    /**
     * Constructs a handler.
     *
     * @param in the incoming socket
     * @param c the counter for the handlers (used in prompts)
     */
    public ThreadedEchoHandler(Socket in, int c) {
        incoming = in;
        counter = c;
    }

    public void run() {
        try {
            try {
                InputStream inStream = incoming.getInputStream();
                OutputStream outStream = incoming.getOutputStream();

                Scanner in = new Scanner(inStream);
                PrintWriter out = new PrintWriter(outStream, true /* autoFlush */);

                out.println("Hello! Enter BYE to exit.");

                // echo client input
                boolean done = false;
                while (!done && in.hasNextLine()) {
                    String line = in.nextLine();
                    out.println("Echo: " + line);
                    System.out.println("ECHO: " + line);
                    if (line.trim().equals("BYE"))
                        done = true;
                }
            } finally {
                incoming.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
