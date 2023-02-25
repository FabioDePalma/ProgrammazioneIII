package teoria.i.sincThread.h.bankWait.wrong;

class BankAccount {
    private int balance;

    public void deposit(int amount) {
        int temp = balance;
        temp = temp + amount;
        balance = temp;
    }

    public boolean withdraw(int amount) {
        if (amount > balance)
            return false;
        int temp = balance;
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
        }
        temp = temp - amount;
        balance = temp;
        return true;
    }

    public int getBalance() {
        return balance;
    }
}
