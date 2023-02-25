package teoria.i.sincThread.h.bankWait.testSynchr;

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
        accounts[from].withdraw(amount);
        System.out.println("ritirati da " + from + " " + amount);
        accounts[to].deposit(amount);
        System.out.println("versati a " + to + " " + amount);
    }

    public int size() {
        return accounts.length;
    }

    public void printTotal() {
        int sum = 0;
        for (int i = 0; i < accounts.length; i++)
            sum = sum + accounts[i].getBalance();
        System.out.println("\nSomma totale in banca: " + sum);
    }
}
