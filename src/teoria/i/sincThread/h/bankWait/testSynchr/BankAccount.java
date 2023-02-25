package teoria.i.sincThread.h.bankWait.testSynchr;

class BankAccount {
    private int balance = 0;

    public synchronized void deposit(int amount) {
        int temp = balance;
        temp = temp + amount;
        balance = temp;
        notifyAll();
    }

    // se la soglia di prelevamento � troppo alta withdraw si blocca
    public synchronized void withdraw(int amount) {
        while (amount > balance)
            try {
                wait();
            } catch (InterruptedException e) {
            }
        int temp = balance;
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
        }
        temp = temp - amount;
        balance = temp;
    }

    public synchronized int getBalance() {
        return balance;
    }
}
