package teoria.h.thread.e.pingPong.parte1;

class PingPong extends Thread {
    private int delay;

    public PingPong(String str, int d) {
        super(str);
        delay = d;
    }

    public void run() {
        for (int i = 1; i < 40; i++) {
            System.out.println(getName());
            try {
                sleep(delay);
            } catch (InterruptedException e) {
                return;
            }
        }
        System.out.println("DONE! " + getName());
    }
}
