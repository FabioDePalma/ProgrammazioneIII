package teoria.h.thread.i.runnable.runnable0;

class ProvaRunnable {
	public static void main(String[] args) {
		MyRun mr = new MyRun();// ogni start fa partire un nuovo thread;
		new Thread(mr).start();
		new Thread(mr).start();
	}
}