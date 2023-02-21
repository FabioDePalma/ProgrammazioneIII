package teoria.h.thread.e.pingPong.parte1;
// creo due thread e verifico alternanza di esecuzione
// se applico priorit� diverse non ottengo effetti distinguibili nell'alternanza


public class PingPongApp1 {

    public static void main (String[] args) {
        Thread t1 = new PingPong("PING", 150);
        //t1.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        Thread t2 = new PingPong("          PONG", 150);
        //t2.setPriority(Thread.MIN_PRIORITY);
        t2.start();

    }
}