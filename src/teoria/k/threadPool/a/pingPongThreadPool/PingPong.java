package teoria.k.threadPool.a.pingPongThreadPool;

class PingPong implements Runnable {

    private int delay;
    private String name;

    public PingPong(String str, int d) {
        delay = d;
        name = str;
    }

    public void run() {
        for (int i = 1; i < 3; i++) {
            System.out.println(name + " " + Thread.currentThread().getName());
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                return;
            }
        }
        System.out.println("DONE! " + name + " " + Thread.currentThread().getName());
    }
}
