package teoria.i.sincThread.a.interferenze.b.stampante.stampaStatic;

class ThreadStampa extends Thread {
    String[] a;
    Stampante st;

    public ThreadStampa(String[] arr) {
        a = arr;
    }

    public void run() {
        Stampante.stampa(a);
    }
}
