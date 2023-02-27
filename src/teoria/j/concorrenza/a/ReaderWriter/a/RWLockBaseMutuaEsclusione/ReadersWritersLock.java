package teoria.j.concorrenza.a.ReaderWriter.a.RWLockBaseMutuaEsclusione;

import java.util.concurrent.locks.*;

// Implementa i lettori-scrittori usando il
// Lock --> lettura e scrittura sono tutte mutuamente esclusive
// i lettori possono cominciare a leggere prima che uno scrittore scriva
// non ci sono controlli sul fatto che il database contenga o meno dei dati

class ReadersWritersLock {
	public static void main(String[] args) {
		int numReaders = 3;
      	int numWriters = 2;

      	Database db = new Database();

      	for (int i = 0; i < numReaders; i++)
         	new Reader(i, db);
        try {
			Thread.sleep(300);
		} catch (InterruptedException e) {};
      	for (int i = 0; i < numWriters; i++)
         	new Writer(numReaders + i, db);
   	}
}



