package teoria.i.sincThread.f.prodConsCubbyHole.ok;

// sincronizzazione lato server
class CubbyHole {
    private int content = -1;
    private boolean available = false;

    public synchronized int get() {
        while (!available) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        available = false;
        /* fondamentale notifyAll(), anzich� notify(), per prevenire deadlock */
        notifyAll();
        return content;
    }

    public synchronized void put(int value) {
        while (available) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        content = value;
        available = true;
        notifyAll();
    }
}
