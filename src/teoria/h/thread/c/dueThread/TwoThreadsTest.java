package teoria.h.thread.c.dueThread;

public class TwoThreadsTest {
    public static void main (String[] args) {
        new SimpleThread("cinema").start();
        new SimpleThread("pizzeria").start();
    }
}