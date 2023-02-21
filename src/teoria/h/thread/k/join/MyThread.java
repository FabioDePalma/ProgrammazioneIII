package teoria.h.thread.k.join;

class MyThread extends Thread {
    private int num;

    public MyThread(int num) {
        super();
        this.num = num;
    }

    public void run() {
        for (int i = 1; i < 4; i++) {
            System.out.println("Sono il thread " + getName());
            try {
                sleep(num);
            } catch (InterruptedException e) {
                return;
            }
        }
        System.out.println("DONE! " + getName());
    }
}
