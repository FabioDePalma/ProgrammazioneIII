package teoria.i.sincThread.a.interferenze.b.stampante.stampa;

class ThreadStampa extends Thread {
    String[] a;
    Stampante st;

    public ThreadStampa(String[] arr, Stampante s) {
        a = arr;
        st = s;
    }

    public void run() {
        st.stampa(a);
    }
}
