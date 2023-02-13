package teoria.f.observerObservable.observerConto3;

import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class ObserverContoEcc {

    public static void main(String[] args) {
        FinestraConto f = new FinestraConto();

        ContoBancario cb1 = new ContoBancario();
        GestisciOperazioni v1 = new GestisciOperazioni(cb1);
        cb1.addObserver(f);

        ContoBancario cb2 = new ContoBancario();
        GestisciOperazioni v2 = new GestisciOperazioni(cb2);
        cb2.addObserver(f);

    }
}



