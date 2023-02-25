package teoria.i.sincThread.i.pipe.pipeTestBinaryData;

import java.io.*;
import java.util.*;

/* In questo esercizio viene implementata una pipeline di thread che comunicano come segue:
Producer -->pout1-pin1--> Filter -->pout2-pin2--> Consumer
*/

class PipeTestBinaryData {


   public static void main(String[] args) {
	   try {
      	PipedOutputStream pout1 = new PipedOutputStream();
      	PipedInputStream pin1 = new PipedInputStream(pout1);

      	PipedOutputStream pout2 = new PipedOutputStream();
      	PipedInputStream pin2 = new PipedInputStream(pout2);

      	Producer prod = new Producer(pout1);
      	Filter filt = new Filter(pin1, pout2);
      	Consumer cons = new Consumer(pin2);

      	prod.start();
      	filt.start();
      	cons.start();
	}
	catch (IOException e) {System.out.println(e.getMessage());}
   }
}


