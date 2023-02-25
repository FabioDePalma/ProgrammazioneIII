package teoria.i.sincThread.i.pipe.pipeTestOggetti;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.Date;

class Sender extends Thread {
    private OutputStream out;

    public Sender(OutputStream w) {
        out = w;
    }

    public void run() {
        ObjectOutputStream oout = null;
        try {
            oout = new ObjectOutputStream(out);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        for (int i = 0; i < 5; i++) {
            //while(true) {
            try {
                Date d = new Date();
                System.out.println("scrivi data: " + d);
                oout.writeObject(d);
                sleep(500);
            } catch (IOException e) {
                System.out.println(e.getMessage());
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
