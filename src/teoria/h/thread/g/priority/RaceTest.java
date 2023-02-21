package teoria.h.thread.g.priority;

public class RaceTest {

    private final static int NUMRUNNERS = 2;

/* Prova di modifica di priority dei thread
*/

    public static void main(String[] args) {
         SelfishRunner[] runners = new SelfishRunner[NUMRUNNERS];

         for (int i = 0; i < NUMRUNNERS; i++) {
             runners[i] = new SelfishRunner(i);
             //runners[i].setPriority(5*(i+1));
         }

		 runners[0].setPriority(Thread.MIN_PRIORITY);
		 runners[1].setPriority(Thread.MAX_PRIORITY);


         for (int i = 0; i < NUMRUNNERS; i++)
            runners[i].start();
    }
}

