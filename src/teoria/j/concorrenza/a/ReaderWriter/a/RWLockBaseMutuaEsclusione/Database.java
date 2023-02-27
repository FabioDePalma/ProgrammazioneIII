package teoria.j.concorrenza.a.ReaderWriter.a.RWLockBaseMutuaEsclusione;

class Database {
    private Object l1 = new Object();

    public void read(int i) {
        synchronized (l1) {
            System.out.println("Start reading - thread  " + i);
            try {
                Thread.sleep((int) (Math.random() * 1000));
            } catch (InterruptedException e) {
            }
        }
        System.out.println("End reading - thread " + i);
    }

    public void write(int i) {
        synchronized (l1) {
            System.out.println("Start writing - thread " + i);
            try {
                Thread.sleep((int) (Math.random() * 1000));
            } catch (InterruptedException e) {
            }
        }
        System.out.println("End writing - thread " + i);
    }

}
