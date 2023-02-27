package teoria.i.sincThread.h.bankWait.wrong;

class Bank {
    private BankAccount[] accounts;

    Bank(int nacc, int init) {
        accounts = new BankAccount[nacc];
        for (int i = 0; i < nacc; i++) {
            accounts[i] = new BankAccount();
            accounts[i].deposit(init);
        }
    }

    public void transfer(int from, int to, int amount) {
        System.out.println("trasferimento da " + from + " a " + to + " di " + amount);
        if (!accounts[from].withdraw(amount))
            return;
        accounts[to].deposit(amount);
        printTotal();
    }

    public int size() {
        return accounts.length;
    }

    public void printTotal() {
        int sum = 0;
        for (int i = 0; i < accounts.length; i++)
            sum = sum + accounts[i].getBalance();
        System.out.println("Somma totale di denaro in banca: " + sum);
    }
}
