package teoria.k.threadPool.c.scheduledExecutor;

class MyTask implements Runnable {

    private String name;

    public MyTask(String str) {
        name = str;
    }

    public void run() {
        System.out.println(name + " " + Thread.currentThread().getName());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            return;
        }
        System.out.println("DONE! " + name + " " + Thread.currentThread().getName());
    }
}
