package teoria.i.sincThread.h.bankWait.testSynchr;

class BankTestSynchr {
	 public static void main(String[] args) {
		Bank b = new Bank(10, 1000);
		b.printTotal();
		System.out.println("%%%%%%%%%%%%%%%%%%\n\n");
		int num = 10;
		TransferThread[] tt = new TransferThread[num];
      	for (int i=0; i < num; i++) {
			// se metto una soglia di prelevamento altissima rischio la non terminazione
			// del programma perch� le operazioni di prelevamento si bloccano
			//tt[i] = new TransferThread(b,80000);
			tt[i] = new TransferThread(b,8000);
			tt[i].start();
		}

		// attendo fine di tutti i trasferimenti per stampare totale in banca
      	for (int i=0; i < num; i++)
         	try {
         		tt[i].join();
			}
			catch (InterruptedException e) {System.out.println(e.getMessage());}
		System.out.println("\n\n%%%%%%%%%%%%%%%%%%");
		System.out.println("%%%%%%%%%%%%%%%%%%");
		b.printTotal();
	}

}


