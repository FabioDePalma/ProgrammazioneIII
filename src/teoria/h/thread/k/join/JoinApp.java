package teoria.h.thread.k.join;

public class JoinApp {

    public static void main(String[] args) {
        Thread t1 = new MyThread(800);
        /* 					Se metto qui la join il main termina prima di t1 */
        try {
            t1.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        Thread t2 = new MyThread(300);
        t2.start();
        try {
            t2.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("IL MAIN è FINITO!");
    }
}