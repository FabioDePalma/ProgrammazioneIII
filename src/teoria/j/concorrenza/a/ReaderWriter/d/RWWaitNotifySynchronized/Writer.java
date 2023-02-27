package teoria.j.concorrenza.a.ReaderWriter.d.RWWaitNotifySynchronized;

class Writer implements Runnable {
    private int id;
    private ReadWriteCoord rw;

    public Writer(int i, ReadWriteCoord c) {
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
            rw.startWrite(id);
            // scrittura
            try {
                Thread.sleep((int) (Math.random() * 1000));
            } catch (InterruptedException e) {
            }
            rw.endWrite(id);
        }
    }
}
