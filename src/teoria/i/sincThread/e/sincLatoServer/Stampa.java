package teoria.i.sincThread.e.sincLatoServer;

class Stampa extends Thread {
    MiaClasse obj;

    public Stampa(MiaClasse o) {
        obj = o;
    }

    // lato server si rendono sincronizzati i metodi di accesso alle variabili condivise
// ma non sempre basta... in questo caso serve sincronizzazione lato client!
    public void run() {
        //synchronized(obj) {
        for (int i = 0; i < 7; i++) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            System.out.println(Thread.currentThread().getName() + ": " + obj);
        }
        //}
    }
}
