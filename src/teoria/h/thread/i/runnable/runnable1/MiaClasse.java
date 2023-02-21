package teoria.h.thread.i.runnable.runnable1;

class MiaClasse implements Runnable {
    private int i = 0;

    public void run() {
        i++;
        System.out.println("i = " + i);
        System.out.println("nella run- thread  " + Thread.currentThread().getName() + ": i = " + i);
    }
}
