package teoria.f.observerObservable.observerConto0;

import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


// visualizza a video lo stato del conto corrente utilizzando direttamente lo standard output (System.out.println())
public class ObserverContoApp0 {

    public static void main(String[] args) {
        ContoBancario cb = new ContoBancario();
        MostraConto f = new MostraConto();
        GestisciOperazioni v = new GestisciOperazioni(cb);
        cb.addObserver(f); // aggiunge l'osservatore all'oggetto Observable ContoBancario
    }
}


