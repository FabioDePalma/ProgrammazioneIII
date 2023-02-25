package teoria.i.sincThread.d.sincLatoClient;

public class SincrClient {
	public static void main(String[] args) {
		MiaClasse obj = new MiaClasse();
		Stampa t1 = new Stampa(obj);
		Stampa t2 = new Stampa(obj);
		t1.start();
		t2.start();
	}
}