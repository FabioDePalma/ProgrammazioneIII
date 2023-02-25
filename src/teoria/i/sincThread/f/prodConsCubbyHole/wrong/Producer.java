package teoria.i.sincThread.f.prodConsCubbyHole.wrong;

class Producer extends Thread {
    private CubbyHole cubbyhole;
    private int number;

    public Producer(CubbyHole c, int number) {
        cubbyhole = c;
        this.number = number;
    }

    public void run() {
        try {
            sleep(3000);
        } catch (InterruptedException e) {
        }
        for (int i = 0; i < 10; i++) {
            try {
                sleep((int) (Math.random() * 2000));
            } catch (InterruptedException e) {
            }
            cubbyhole.put(i);
            System.out.println("Producer #" + this.number + " put: " + i);
            try {
                sleep((int) (Math.random() * 10));
            } catch (InterruptedException e) {
            }
        }
    }
}
