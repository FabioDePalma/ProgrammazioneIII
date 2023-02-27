package teoria.j.concorrenza.a.ReaderWriter.c.RWWaitNotifyConSynchronizedMethods;

class Database {
    private int numReaders = 0;

    public synchronized void startRead(int i) {
        numReaders++;
        System.out.println("Start reading " + i + "; ci sono " + numReaders + " lettori attivi");
    }

    // quando l'ultimo lettore attivo finisce di leggere notifica i thread in stato di wait (scrittori).
    public synchronized void endRead(int i) {
        numReaders--;
        System.out.println("End reading " + i + "; ci sono " + numReaders + " lettori attivi");
        if (numReaders == 0)
            /* NB: fondamentale fare notifyAll e non notify per prevenire deadlock! */
            notifyAll();
    }


    // quando uno scrittore vede che ci sono lettori attivi si mette in stato di wait.
// quando ha finito di scrivere notifica i thread in stato di wait (scrittori).
// L'operazione di scrittura � gestita in sezione critica
    public synchronized void write(int i) {
        while (numReaders > 0)
            try {
                wait();
            } catch (InterruptedException e) {
            }
        System.out.println("Start writing " + i);
        try {
            Thread.sleep((int) (Math.random() * 1000));
        } catch (InterruptedException e) {
        }
        System.out.println("End writing " + i);
        /* NB: fondamentale fare notifyAll e non notify per prevenire deadlock! */
        notifyAll();
    }
}
