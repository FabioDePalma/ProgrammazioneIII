package teoria.i.sincThread.i.pipe.pipeTest;

import java.io.IOException;
import java.io.Writer;

class Sender extends Thread {
    private Writer out;

    public Sender(Writer w) {
        out = w;
    }

    public void run() {
        for (char c = 'A'; c <= 'F'; c++)
            try {
                System.out.println("scrivi " + c);
                out.write(c);
                sleep(1000);
            } catch (IOException e) {
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
    }
}
