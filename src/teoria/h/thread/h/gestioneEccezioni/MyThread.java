package teoria.h.thread.h.gestioneEccezioni;

class MyThread extends Thread {

    public MyThread() {
        super();
        setUncaughtExceptionHandler(new UncaughtExceptionHandler() {
            public void uncaughtException(Thread th, Throwable exc) {
                System.out.println("Eccezione");
            }
        });
    }

    public void run() {
        // genero eccezione non controllata (RunTimeException);
        String s = null;
        s.toString();
    }
}
