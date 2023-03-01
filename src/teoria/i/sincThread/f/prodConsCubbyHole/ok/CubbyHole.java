package teoria.i.sincThread.f.prodConsCubbyHole.ok;

// sincronizzazione lato server
class CubbyHole {
    private int content = -1;
    private boolean available = false;

    public synchronized int get() {
        while (!available) { //finchè available==false
            try {
                wait();
            } catch (InterruptedException e) {}
        }
        available = false;
        /* fondamentale notifyAll(), anzichè notify(), per prevenire deadlock */
        notifyAll(); //risveglio i thread in coda di wait
        return content;
    }

    public synchronized void put(int value) {
        while (available) { //finchè available==true
            try {
                wait();
            } catch (InterruptedException e) {}
        }
        content = value;
        available = true;
        notifyAll(); //risveglio i thread in coda di wait
    }
}
