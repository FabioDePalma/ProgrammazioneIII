package teoria.i.sincThread.f.prodConsCubbyHole.ok;

class Producer extends Thread {
    private CubbyHole cubbyhole;
    private int number;

    public Producer(CubbyHole c, int number) {
        cubbyhole = c;
        this.number = number;
    }

    public void run() {
        //try {
        //   sleep(4000);
        //} catch (InterruptedException e) { }
        for (int i = 1; i < 5; i++) {
            int num = number * i;
            cubbyhole.put(num);
            System.out.println("Producer #" + this.number + " put: " + num);
            try {
                sleep((int) (Math.random() * 10));
            } catch (InterruptedException e) {
            }
        }
        System.out.println("Producer #" + this.number + " ha finito di produrre");
    }
}
