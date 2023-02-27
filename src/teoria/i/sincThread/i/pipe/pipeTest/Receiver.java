package teoria.i.sincThread.i.pipe.pipeTest;

import java.io.IOException;
import java.io.Reader;

class Receiver extends Thread {
    private Reader in;

    public Receiver(Reader r) {
        in = r;
    }

    public void run() {
        try {
            while (true) {
                sleep(1000);
                System.out.println("leggi " + (char) in.read());
            }
        } catch (IOException | InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
