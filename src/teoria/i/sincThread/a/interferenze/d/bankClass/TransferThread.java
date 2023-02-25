package teoria.i.sincThread.a.interferenze.d.bankClass;

class TransferThread extends Thread {
    private Bank bank;
    private int maxAmount;

    public TransferThread(Bank b, int max) {
        bank = b;
        maxAmount = max;
    }

    public void run() {
        int from = (int) (bank.size() * Math.random());
        int to = (int) (bank.size() * Math.random());
        int amount = (int) (maxAmount * Math.random());
        bank.transfer(from, to, amount);
    }
}
