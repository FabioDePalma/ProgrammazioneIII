package teoria.j.concorrenza.a.ReaderWriter.b.RWReentrantLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

class Database {
    private ReadWriteLock rwl = new ReentrantReadWriteLock();
    private Lock rl = rwl.readLock();
    private Lock wl = rwl.writeLock();

    public void read(int i) {
        rl.lock();
        System.out.println("Start reading - thread  " + i);
        try {
            Thread.sleep((int) (Math.random() * 1000));
        } catch (InterruptedException e) {
        }
        System.out.println("End reading - thread " + i);
        rl.unlock();
    }

    public void write(int i) {
        wl.lock();
        System.out.println("Start writing - thread " + i);
        try {
            Thread.sleep((int) (Math.random() * 1000));
        } catch (InterruptedException e) {
        }
        System.out.println("End writing - thread " + i);
        wl.unlock();
    }

}
