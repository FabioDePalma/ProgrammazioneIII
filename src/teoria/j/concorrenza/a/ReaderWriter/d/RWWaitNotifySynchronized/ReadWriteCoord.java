package teoria.j.concorrenza.a.ReaderWriter.d.RWWaitNotifySynchronized;

class ReadWriteCoord {
    private int numReaders = 0;
    private int numWriters = 0;

    // quando un lettore inizia a leggere, se c'� almeno uno scrittore attivo, si sospende
    public synchronized void startRead(int i) {
        while (numWriters > 0)
            try {
                wait();
            } catch (InterruptedException e) {
            }
        numReaders++;
        System.out.println("Start reading " + i + "; ci sono " + numReaders + " lettori attivi");
    }

    // quando un lettore finisce di leggere, se non ci sono altri lettori attivi, notifica i thread in stato di wait
    public synchronized void endRead(int i) {
        numReaders--;
        System.out.println("End reading " + i + "; ci sono " + numReaders + " lettori attivi");
        if (numReaders == 0)
            notifyAll();
    }

    // quando uno scrittore inizia a scrivere, se c'� almeno uno scrittore o un lettore
// attivo, si sospende
    public synchronized void startWrite(int i) {
        while (numReaders > 0 || numWriters > 0)
            try {
                wait();
            } catch (InterruptedException e) {
            }
        numWriters++;
        System.out.println("Start writing " + i + "; ci sono " + numWriters + " scrittori attivi");
    }

    // quando uno scrittore finisce di scrivere notifica i thread sospesi
    public synchronized void endWrite(int i) {
        numWriters--;
        System.out.println("End writing " + i + "; ci sono " + numWriters + " scrittori attivi");
        notifyAll();
    }

}
