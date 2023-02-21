package teoria.h.thread.b.provaThread.thread1;


class ProvaThread {
	public static void main(String[] args) {
		new MyThread().start();
		new MyThread().start();
		System.out.println("Sono il thread " + (Thread.currentThread()).getName());
	}
}