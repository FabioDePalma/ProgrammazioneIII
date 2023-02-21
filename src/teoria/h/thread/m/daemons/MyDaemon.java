package teoria.h.thread.m.daemons;

import java.util.Random;

class MyDaemon extends Thread {
    private int delay;

    public MyDaemon(String str, int d) {
        super(str);
        delay = d;
        setDaemon(true);
    }

    public void run() {
        Random r = new Random();
        while (true) {
            System.out.println(r.nextInt());
            try {
                sleep(delay);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
                return;
            }
        }
    }
}
