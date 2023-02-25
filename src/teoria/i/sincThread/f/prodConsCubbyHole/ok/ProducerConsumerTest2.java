package teoria.i.sincThread.f.prodConsCubbyHole.ok;

public class ProducerConsumerTest2 {
    public static void main(String[] args) {
        CubbyHole c = new CubbyHole();
        Consumer c1 = new Consumer(c, 1);
        Consumer c2 = new Consumer(c, 2);
        Consumer c3 = new Consumer(c, 3);

        Producer p1 = new Producer(c, 10);
        Producer p2 = new Producer(c, 20);
        Producer p3 = new Producer(c, 30);

        p1.start();
        p2.start();
        p3.start();
        c1.start();
        c2.start();
        c3.start();
    }
}

/* NB: se i produttori non producono quanto necessario ai
consumatori il programma non termina perch� restano dei consumatori
in attesa di dati */

