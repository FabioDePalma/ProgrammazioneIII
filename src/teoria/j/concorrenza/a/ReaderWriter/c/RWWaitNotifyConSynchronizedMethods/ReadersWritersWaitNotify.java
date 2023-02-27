package teoria.j.concorrenza.a.ReaderWriter.c.RWWaitNotifyConSynchronizedMethods;

public class ReadersWritersWaitNotify {

	public static void main(String[] args) {
		int numReaders = 3;
      	int numWriters = 2;

      	Database db = new Database();

      	for (int i = 0; i < numReaders; i++)
         	new Reader(i, db);
      	for (int i = 0; i < numWriters; i++)
         	new Writer(numReaders + i, db);
   }
}


/*
   Spezziamo read in due parti per permettere a più thread di lavorare in parallelo.
   La write no perch� deve essere eseguita in mutua esclusione.
   */


