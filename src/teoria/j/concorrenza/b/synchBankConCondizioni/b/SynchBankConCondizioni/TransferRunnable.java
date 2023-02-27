package teoria.j.concorrenza.b.synchBankConCondizioni.b.SynchBankConCondizioni;

/**
 * A runnable that transfers money from an account to other
 * accounts in a bank.
 */
class TransferRunnable implements Runnable {

    private Bank bank;
    private int fromAccount;
    private double maxAmount;
    private int repetitions;
    private int DELAY = 10;

    /**
     * Constructs a transfer runnable.
     *
     * @param b    the bank between whose account money is transferred
     * @param from the account to transfer money from
     * @param max  the maximum amount of money in each transfer
     */
    public TransferRunnable(Bank b, int from, double max) {
        bank = b;
        fromAccount = from;
        maxAmount = max;
    }

    public void run() {
        try {
            while (true) {
                int toAccount = (int) (bank.size() * Math.random());
                double amount = maxAmount * Math.random();
                bank.transfer(fromAccount, toAccount, amount);
                //bank.transfer(fromAccount, toAccount, 10*amount); // per bloccare i thread....
                Thread.sleep((int) (DELAY * Math.random()));
            }
        } catch (InterruptedException e) {
        }
    }
}
