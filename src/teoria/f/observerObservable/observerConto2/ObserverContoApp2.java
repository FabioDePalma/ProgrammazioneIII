package teoria.f.observerObservable.observerConto2;

import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


// qui il legame tra osservato e osservatore avviene attraverso l'uso del parametro Observable del metodo update;
public class ObserverContoApp2 {

    public static void main(String[] args) {
        ContoBancario cb = new ContoBancario();
        FinestraConto f = new FinestraConto();
        cb.addObserver(f); // aggiunge l'osservatore all'oggetto Observable ContoBancario
        GestisciOperazioni v = new GestisciOperazioni(cb);
    }
}


