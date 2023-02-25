package teoria.i.sincThread.c.lockOggettoCondiviso.dueLock;

import java.util.*;

class DueLock {
	public static void main(String[] args) {
		Object lock1 = new Object();
		Object lock2 = new Object();
		// uso un solo lock per non far interrompere l'esecuzione delle operazioni
		//Stampa t1 = new Stampa(lock1, lock1, "");
		//Stampa t2 = new Stampa(lock1, lock1, "                      ");
		// uso due lock: le operazioni si interfogliano - OK solo se operano su risorse diverse
		Stampa t1 = new Stampa(lock1, lock2, "");
		Stampa t2 = new Stampa(lock1, lock2, "                      ");
		t1.start();
		t2.start();
	}
}