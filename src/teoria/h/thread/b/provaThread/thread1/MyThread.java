package teoria.h.thread.b.provaThread.thread1;

class MyThread extends Thread {
    public void run() {
        System.out.println("Sono il thread " + getName());
    }
}
