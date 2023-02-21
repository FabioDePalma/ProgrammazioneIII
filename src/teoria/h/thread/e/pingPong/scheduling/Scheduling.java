package teoria.h.thread.e.pingPong.scheduling;

import java.util.*;


class Scheduling {

	 public static void main (String[] args) {

	 	Step fondamenta = new Step("fondamenta", new ArrayList<Step>());

	 	ArrayList<Step> prec1 = new ArrayList<>();
	 	prec1.add(fondamenta);

		Step muri = new Step("muri", prec1);
		Step me = new Step("muri esterni", prec1);
		Step camino = new Step("camino", prec1);

		ArrayList<Step> prec2 = new ArrayList<>();
		prec2.add(me);
		Step tetto = new Step("tetto", prec2);
		Step fi = new Step("finestre", prec2);

		ArrayList<Step> prec3 = new ArrayList<>();
		prec3.add(camino);
		prec3.add(tetto);
		Step tappezz = new Step("tappezzeria", prec3);

		ArrayList<Step> prec4 = new ArrayList<>();
		prec4.add(muri);
		Step porte = new Step("porte", prec4);

		fondamenta.start();

	 	muri.start();
	 	me.start();
	 	camino.start();

		tetto.start();
		fi.start();

		porte.start();
		tappezz.start();
	 }
}