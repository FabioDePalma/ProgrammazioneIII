package teoria.i.sincThread.c.lockOggettoCondiviso.noLock;

import java.util.*;

class NoLock {
	public static void main(String[] args) {
		Stampa t1 = new Stampa("");
		Stampa t2 = new Stampa("                      ");
		t1.start();
		t2.start();
	}
}