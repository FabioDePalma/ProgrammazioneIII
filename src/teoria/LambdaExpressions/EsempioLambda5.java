package teoria.LambdaExpressions;

interface Prova3 {
	public void stampa(String s);
}

public class EsempioLambda5 {
	public static void main(String[] args) {
		Prova3 p = messaggio -> {System.out.println(messaggio);};
		MyClass m = new MyClass();
		m.metodo(p);
	}
}

class MyClass {
	void metodo(Prova3 p) {
		System.out.println("Sto per richiamare il metodo stampa");
		p.stampa("Metodo invocato!");
	}
}