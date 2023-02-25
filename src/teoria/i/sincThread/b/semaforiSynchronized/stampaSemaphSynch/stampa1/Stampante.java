package teoria.i.sincThread.b.semaforiSynchronized.stampaSemaphSynch.stampa1;

import java.util.concurrent.Semaphore;

class Stampante {
    private Semaphore sem = new Semaphore(1);

    public void stampa(String[] a) {
        try {
            sem.acquire();
            for (int i = 0; i < a.length; i++) {
                Thread.sleep((long) (Math.random() * 100));
                System.out.println(a[i]);
            }
            String s = a[4];
            //sem.release(); //non va qui ma va nel blocco finally
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        } finally {
            sem.release();
        }
    }
}
