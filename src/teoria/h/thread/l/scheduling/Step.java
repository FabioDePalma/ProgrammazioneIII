package teoria.h.thread.l.scheduling;

import java.util.List;

class Step extends Thread {
    List<Step> precondizioni;

    public Step(String str, List<Step> precondizioni) {
        super(str);
        this.precondizioni = precondizioni;
    }

    private void myJoin() {
        for (Thread prec : precondizioni) {
            try {
                prec.join();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public void run() {
        myJoin();
        try {
            sleep((long) (Math.random() * 1000));
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(getName() + "  terminato");
    }
}
