package teoria.i.sincThread.e.sincLatoServer;



public class SincrServer {
	public static void main(String[] args) {
		MiaClasse obj = new MiaClasse();
		Stampa t1 = new Stampa(obj);
		Stampa t2 = new Stampa(obj);
		t1.start();
		t2.start();
	}
}