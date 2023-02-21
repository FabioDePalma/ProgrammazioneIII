package teoria.h.thread.m.daemons;

import java.util.*;

public class DaemonApp1 {

    public static void main (String[] args) {
        Thread t1 = new MyDaemon("GeneratoreNumeri", 100);
        t1.start();
        try {
           Thread.sleep(4000);
            } catch (InterruptedException e) {System.out.println(e.getMessage());
            									return;}
    }
}