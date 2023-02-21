package teoria.h.thread.e.pingPong.parte2;

class PingPong implements Runnable {
    private int delay;
    private String name;

    public PingPong(String str, int d) {
        delay = d;
        name = str;
    }

    public void run() {
        for (int i = 1; i < 40; i++) {
            System.out.println(name);
            try {
                //sleep(delay); // non � metodo di Runnable!!!
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                return;
            }
        }
        System.out.println("DONE! " + name);
    }
}
