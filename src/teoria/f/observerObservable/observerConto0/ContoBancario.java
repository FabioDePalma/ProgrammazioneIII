package teoria.f.observerObservable.observerConto0;

import java.util.Observable;

class ContoBancario extends Observable {
    private int saldo = 0;

    public void prelievo(int val) {
        saldo -= val;
        setChanged();
        notifyObservers();
    }

    public void versamento(int val) {
        saldo += val;
        setChanged(); //marca il cambiamento di stato
        notifyObservers(); //notifica il cambiamento agli osservatori
    }

    public int getSaldo() {
        return saldo;
    }
}
