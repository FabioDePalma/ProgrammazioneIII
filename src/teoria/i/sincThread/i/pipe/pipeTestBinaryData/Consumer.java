package teoria.i.sincThread.i.pipe.pipeTestBinaryData;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * A thread that reads numbers from a stream and
 * prints out those that deviate from previous inputs
 * by a threshold value.
 */
class Consumer extends Thread {
    private double oldx = 0;
    private DataInputStream in;
    private static final double THRESHOLD = 0.01;

    /**
     * Constructs a consumer thread.
     *
     * @param is the input stream
     */
    public Consumer(InputStream is) {
        in = new DataInputStream(is);
    }

    public void run() {
        for (; ; ) {
            try {
                double x = in.readDouble();
                if (Math.abs(x - oldx) > THRESHOLD) { // se la nuova media differisce rispetto alla precedente di almeno THRESHOLD
                    System.out.println(x);
                    oldx = x;
                }
            } catch (IOException e) {
                System.out.println("Error: " + e);
            }
        }
    }
}
