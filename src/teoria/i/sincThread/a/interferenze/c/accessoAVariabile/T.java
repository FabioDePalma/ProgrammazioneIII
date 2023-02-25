package teoria.i.sincThread.a.interferenze.c.accessoAVariabile;

class T extends Thread {
    private int num;
    private C c;

    public T(int x, C y) {
        num = x;
        c = y;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            c.m();
            System.out.println("Thread " + num + ": c.i= " + c.i);
        }
    }
}
