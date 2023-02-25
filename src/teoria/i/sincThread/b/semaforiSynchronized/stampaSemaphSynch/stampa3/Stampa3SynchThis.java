package teoria.i.sincThread.b.semaforiSynchronized.stampaSemaphSynch.stampa3;

class Stampa3SynchThis {
	public static void main(String[] args) {
		Stampante st = new Stampante();
		String[] a = {"aa1", "aa2", "aa3", "aa4"};
		String[] b = {"bb1", "bb2", "bb3", "bb4", "bb5"};
		ThreadStampa t1 = new ThreadStampa(a,st);
		ThreadStampa t2 = new ThreadStampa(b,st);
		t1.start();
		t2.start();
	}
}