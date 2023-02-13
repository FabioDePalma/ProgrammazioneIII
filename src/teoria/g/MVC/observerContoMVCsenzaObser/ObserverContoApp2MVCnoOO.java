package teoria.g.MVC.observerContoMVCsenzaObser;

import teoria.g.MVC.observerContoMVCsenzaObser.controller.Controller;
import teoria.g.MVC.observerContoMVCsenzaObser.model.ContoBancario;
import teoria.g.MVC.observerContoMVCsenzaObser.view.FinestraConto;
import teoria.g.MVC.observerContoMVCsenzaObser.view.GestisciOperazioni;


public class ObserverContoApp2MVCnoOO {

	public static void main(String[] args) {
		ContoBancario cb = new ContoBancario(); // modello
      	FinestraConto f = new FinestraConto(cb);  // prima vista
      	GestisciOperazioni v = new GestisciOperazioni();  // seconda vista
      	Controller c = new Controller(cb, v, f);   // controller
      	v.setController(c);					    // aggancio il controller alla vista
   	}
}


