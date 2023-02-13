package teoria.f.observerObservable.observerConto0;

import java.util.Observable;
import java.util.Observer;

class MostraConto implements Observer {

    public void update(Observable ob, Object extra_arg) {
        if (ob != null && ob instanceof ContoBancario) {
            ContoBancario cb = (ContoBancario) ob;
            System.out.println("Saldo = " + cb.getSaldo());
        }
    }
}
