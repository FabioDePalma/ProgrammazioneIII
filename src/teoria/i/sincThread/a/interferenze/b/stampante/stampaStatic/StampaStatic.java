package teoria.i.sincThread.a.interferenze.b.stampante.stampaStatic;

public class StampaStatic {
	public static void main(String[] args) {
		String[] a = {"aa1", "aa2", "aa3", "aa4"};
		String[] b = {"bb1", "bb2", "bb3", "bb4"};
		ThreadStampa t1 = new ThreadStampa(a);
		ThreadStampa t2 = new ThreadStampa(b);
		t1.start();
		t2.start();
	}
}