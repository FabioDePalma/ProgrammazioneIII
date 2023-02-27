package teoria.j.concorrenza.a.ReaderWriter.d.RWWaitNotifySynchronized;

class Reader implements Runnable {
    private int id;
    private ReadWriteCoord rw;

    public Reader(int i, ReadWriteCoord c) {
        id = i;
        rw = c;
        new Thread(this).start();
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep((int) (Math.random() * 1000));
            } catch (InterruptedException e) {
            }
            rw.startRead(id);
            // lettura
            try {
                Thread.sleep((int) (Math.random() * 1000));
            } catch (InterruptedException e) {
            }
            rw.endRead(id);
        }
    }
}
