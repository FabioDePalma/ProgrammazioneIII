package teoria.g.MVC.observerContoMVCsenzaObser.model;

public class ContoBancario { // Model
    private int saldo;

    public ContoBancario() {
        saldo = 0;
    }

    public void versamento(int val) {
        saldo += val;
    }

    public int getSaldo() {
        return saldo;
    }
}
