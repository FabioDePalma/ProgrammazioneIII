package teoria.h.thread.g.priority;

class SelfishRunner extends Thread {

    private int tick = 1;
    private int num;

    public SelfishRunner(int num) {
        this.num = num;
    }

    public void run() {
        while (tick < 800000) {
            tick++;
            if ((tick % 50000) == 0)
                System.out.println("Thread #" + num + ", tick = " + tick);
        }
    }
}
