package teoria.i.sincThread.b.semaforiSynchronized.stampaSemaphSynch.stampa3;

class Stampante {

// L'oggetto da utilizzare in mutua esclusione regola
// l'invocazione dei propri metodi dichiarandoli synchronized.

    public void stampa(String[] a) {
        try {
            synchronized (this) {
                for (int i = 0; i < a.length; i++) {
                    //String s = a[4];
                    Thread.sleep((long) (Math.random() * 100));
                    System.out.println(a[i]);
                }
                String s = a[4];
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
