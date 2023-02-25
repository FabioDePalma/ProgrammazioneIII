package teoria.i.sincThread.i.pipe.pipeTestOggetti;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.util.Date;

class Receiver extends Thread {
    private final InputStream in;

    public Receiver(InputStream r) {
        in = r;
    }

    public void run() {
        System.out.println("parte il receiver");
        ObjectInputStream pin = null;
        try {
            pin = new ObjectInputStream(in);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        try {
            //while (true) {
            for (int i = 0; i < 5; i++) {
                sleep(1000);
                System.out.println("leggi la data: " + (Date) pin.readObject());
            }
        } catch (IOException e) {//System.out.println("fine input");
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
