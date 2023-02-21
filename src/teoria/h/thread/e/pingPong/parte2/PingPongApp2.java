package teoria.h.thread.e.pingPong.parte2;
// specifico il codice da eseguire in flussi paralleli come Runnable

public class PingPongApp2 {

    public static void main (String[] args) {
        Thread t1 = new Thread(new PingPong("PING", 150));
        t1.start();
        Thread t2 = new Thread(new PingPong("          PONG", 150));
        t2.start();
        //t2.start(); // se invocato + di 1 volta il metodo genera eccezione

    }
}