package teoria.j.concorrenza.a.ReaderWriter.b.RWReentrantLock;

import java.util.concurrent.locks.*;

// Implementa i lettori-scrittori usando il
// ReadWriteLock

class ReadersWritersLock {
	public static void main(String[] args) {
		int numReaders = 3;
      	int numWriters = 2;

      	Database db = new Database();

      	for (int i = 0; i < numReaders; i++)
         	new Reader(i, db);
       	 try {
 			Thread.sleep(300);
          } catch(InterruptedException e) {}
      	for (int i = 0; i < numWriters; i++)
         	new Writer(numReaders + i, db);
   	}
}

/* NB: SE SI USANO I READER/WRITER LOCKS POSSONO LEGGERE
   IN PARALLELO PIU' READERS, SE UN WRITER SCRIVE E' IN MUTUA
   ESCLUSIONE TOTALE, MA UN LETTORE PUO' INIZIARE A LEGGERE
   PRIMA CHE ALCUNO SCRITTORE SCRIVA. DIRE CHE I LETTORI ACCEDONO
   IN MUTUA ESCLUSIONE RISPETTO AGLI SCRITTORI, E CHE OGNI SCRITTORE
   OPERA IN MUTUA ESCLUSIONE TOTALE NON BASTA...
*/



