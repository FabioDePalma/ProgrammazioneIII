package teoria.j.concorrenza.a.ReaderWriter.b.RWReentrantLock;

class Writer implements Runnable {
    private int id;
    private Database db;

    public Writer(int i, Database d) {
        id = i;
        db = d;
        new Thread(this).start();
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep((int) (Math.random() * 100));
            } catch (InterruptedException e) {
            }
            db.write(id);
            try {
                Thread.sleep((int) (Math.random() * 100));
            } catch (InterruptedException e) {
            }
        }
    }
}
