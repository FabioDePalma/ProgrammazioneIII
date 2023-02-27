package teoria.j.concorrenza.a.ReaderWriter.d.RWWaitNotifySynchronized;

class ReadersWritersSynchronized {
	public static void main(String[] args) {
		int numReaders = 3;
      	int numWriters = 2;

      	ReadWriteCoord rw = new ReadWriteCoord();

      	for (int i = 0; i < numReaders; i++)
         	new Reader(i, rw);

        /* se posticipo la creaz dei writer i reader leggono lo stesso...
		try {
				Thread.sleep((int)(Math.random() * 4000));
            }  catch(InterruptedException e) {}
		*/
      	for (int i = 0; i < numWriters; i++)
         	new Writer(numReaders + i, rw);
   	}
}

/* NB: READER E WRITER SI COORDINANO PRENDENDO L'ELEMENTO DI SINCRONIZZAZIONE
   ReadWriteCoord. PERO' ANCHE QUI POTREBBE DARSI CHE UN LETTORE LEGGA PRIMA
   CHE UNO SCRITTORE SCRIVA PERCHE' LA WAIT E' SOLO SUBORDINATA AL NON AVERE WRITER ATTIVI.
   */

