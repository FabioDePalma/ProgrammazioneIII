package teoria.f.observerObservable.observerConto2;

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
        setChanged();
        notifyObservers();
    }

    public int getSaldo() {
        return saldo;
    }
}
