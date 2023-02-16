package org.LAB.Esercizio4.Esercizio4Diana.es1;

import org.LAB.Esercizio4.Esercizio4Diana.es1.Controller.Controller;
import org.LAB.Esercizio4.Esercizio4Diana.es1.Model.Counter;
import org.LAB.Esercizio4.Esercizio4Diana.es1.Model.Filter;
import org.LAB.Esercizio4.Esercizio4Diana.es1.View.Visualizer;

/*
import org.LAB.Esercizio4.Esercizio4Diana.es1.Model.Counter;
import org.LAB.Esercizio4.Esercizio4Diana.es1.Model.Filter;
import org.LAB.Esercizio4.Esercizio4Diana.es1.View.Visualizer;

 */
public class Exercise1 {
	public static void main(String[] args) {
		Counter counter = new Counter();
		Filter filter = new Filter();
		Visualizer visualizer = new Visualizer();
		Controller controller = new Controller(counter,filter,visualizer);
		controller.run();
		/*
		Visualizer v = new Visualizer();
		Filter f = new Filter(v);
		Counter c = new Counter(f);
		c.start();
		 */
   	}
}









