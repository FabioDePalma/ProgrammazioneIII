package teoria.LambdaExpressions;

interface Prova2 {
	public void stampa(String s);
}

public class EsempioLambda4 {
	public static void main(String[] args) {
		Prova2 p = messaggio -> {
			System.out.println(messaggio);
		};
		p.stampa("CIAO!!");
	}
}
