package teoria.f.observerObservable.observerConto3;

import java.util.Observable;

class ContoBancario extends Observable {
    private static int conti = 0;
    private int numConto;
    private int saldo;

    public ContoBancario() {
        numConto = conti++;
        saldo = 0;
    }

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

    public int getNumero() {
        return numConto;
    }
}
