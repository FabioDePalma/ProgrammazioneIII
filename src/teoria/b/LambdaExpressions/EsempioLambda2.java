package teoria.b.LambdaExpressions;

import java.util.Comparator;

public class EsempioLambda2 {
	public static void main(String[] args) {
		// senza tipo dei parametri
		// con body semplificato
		Comparator<String> c = (s1, s2) -> s1.compareTo(s2);
				//(s1, s2) -> return 1; sbagliato perche' non funzionale
		int ris = c.compare("ciao", "ciao");
		System.out.println(ris);
		System.out.println(c.compare("ciao1", "ciao2"));
	}
}