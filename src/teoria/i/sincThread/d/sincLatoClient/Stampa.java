package teoria.i.sincThread.d.sincLatoClient;

class Stampa extends Thread {
    MiaClasse obj;

    public Stampa(MiaClasse o) {
        obj = o;
    }

    // lato client si sincronizza l'accesso all'oggetto condiviso usando il lock dell'oggetto
    // il client può sincronizzare una operazione complessa, come il ciclo qui sotto.
    public void run() {
        synchronized (obj) {
            for (int i = 0; i < 7; i++) {
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
                System.out.println(Thread.currentThread().getName() + ": " + obj);
            }
        }
    }
}
