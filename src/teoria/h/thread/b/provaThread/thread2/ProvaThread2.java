package teoria.h.thread.b.provaThread.thread2;


class ProvaThread2 {
	public static void main(String[] args) {
		new MyThread("primo");
		new MyThread("secondo");
		System.out.println("Sono il thread " + Thread.currentThread().getName());
	}
}