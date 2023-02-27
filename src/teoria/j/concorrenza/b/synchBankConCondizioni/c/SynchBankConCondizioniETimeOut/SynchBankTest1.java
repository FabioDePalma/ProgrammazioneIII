package teoria.j.concorrenza.b.synchBankConCondizioni.c.SynchBankConCondizioniETimeOut; /**
   @version 1.30 2004-08-01
   @author Cay Horstmann

   modificato con array di condizioni (una per ogni conto) e altro...
*/

import java.util.concurrent.*;
import java.util.concurrent.locks.*;

/**
   This program shows how multiple threads can safely access a data structure.
*/
public class SynchBankTest1 {

   public static final int NACCOUNTS = 20;
   public static final double INITIAL_BALANCE = 1000;

   public static void main(String[] args) {
      Bank b = new Bank(NACCOUNTS, INITIAL_BALANCE);
      int i;
      for (i = 0; i < NACCOUNTS; i++) {
         TransferRunnable r = new TransferRunnable(b, i, INITIAL_BALANCE);
         new Thread(r).start();
      }
   }
}


