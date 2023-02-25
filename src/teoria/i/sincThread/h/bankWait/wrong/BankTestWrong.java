package teoria.i.sincThread.h.bankWait.wrong;

class BankTestWrong {
	public static void main(String[] args) {
		Bank b = new Bank(10, 1000);
      	for (int i=0; i < 10; i++)
         	new TransferThread(b, 100).start();
   	}
}


