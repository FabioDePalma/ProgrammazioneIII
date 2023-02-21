package teoria.h.thread.b.provaThread.thread2;

class MyThread extends Thread {
    public MyThread(String s) {
        super(s); // invoco super che da' il nome al thread
        start();  // faccio partire il thread direttamente nel costruttore
    }

    public void run() {
        System.out.println("Sono il thread " + getName());
    }
}
