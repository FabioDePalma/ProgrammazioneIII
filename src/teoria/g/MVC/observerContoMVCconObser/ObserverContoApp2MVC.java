package teoria.g.MVC.observerContoMVCconObser;


import teoria.g.MVC.observerContoMVCconObser.controller.Controller;
import teoria.g.MVC.observerContoMVCconObser.model.ContoBancario;
import teoria.g.MVC.observerContoMVCconObser.view.FinestraConto;
import teoria.g.MVC.observerContoMVCconObser.view.GestisciOperazioni1;
import teoria.g.MVC.observerContoMVCconObser.view.IGestisci;

public class ObserverContoApp2MVC {

	public static void main(String[] args) {
		ContoBancario cb = new ContoBancario(); // modello
      	FinestraConto f = new FinestraConto();  // prima vista
      	cb.addObserver(f); // aggiungo la prima vista come osservatrice del model conto corrente bancario
        cb.settaSaldoIniziale(0);

      	IGestisci v = new GestisciOperazioni1();  // prima vista
      	//IGestisci v1 = new GestisciOperazioni2();  // seconda vista
      	Controller c = new Controller(cb, v);   // controller
		//Controller c1 = new Controller(cb, v1);
      	v.setController(c);					    // aggancio il controller alla vista
		//v1.setController(c1);
   	}
}


