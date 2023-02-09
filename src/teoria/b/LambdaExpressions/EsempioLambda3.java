package teoria.b.LambdaExpressions;

interface Prova1 {
	public void stampa();
}

public class EsempioLambda3 {
	public static void main(String[] args) {
		Prova1 p = () -> {System.out.println("CIAO");};
		p.stampa();
	}
}