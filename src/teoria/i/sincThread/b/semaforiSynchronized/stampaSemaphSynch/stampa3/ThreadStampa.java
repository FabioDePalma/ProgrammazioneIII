package teoria.i.sincThread.b.semaforiSynchronized.stampaSemaphSynch.stampa3;

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
