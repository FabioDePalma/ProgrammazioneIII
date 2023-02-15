package org.LAB.Esercizio4.es1;

import org.LAB.Esercizio4.es1.controller.Controller;
import org.LAB.Esercizio4.es1.model.Counter;
import org.LAB.Esercizio4.es1.model.Filter;
import org.LAB.Esercizio4.es1.view.Visualizer;

public class Exercise1 {
	public static void main(String[] args) {
		Visualizer v = new Visualizer();
		Filter f = new Filter();
		Counter c = new Counter();
		Controller contr = new Controller(c,f,v);
		/*
		Adesso sarà il controllore a far partire le esecuzioni con la run
		cosi il controllore gestisce le operazioni del model e della view
		 */
		//c.start();
		contr.run();
   	}
}









