package teoria.g.MVC.observerContoMVCconObser.model;

import java.util.Observable;

public class ContoBancario extends Observable { // Model
    private int saldo;

    public ContoBancario() {
        saldo = 0;
    }

    public void settaSaldoIniziale(int val) {
        saldo = val;
        setChanged();
        notifyObservers();
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
}
