package org.LAB.Esercizio4.soluzioni.es1;

public class Exercise1 {
	public static void main(String[] args) {
		Visualizer v = new Visualizer();
		Counter c = new Counter(0,50);
		Filter f = new Filter();

		Controller controller = new Controller(c,f,v);
		controller.run();
   	}
}









