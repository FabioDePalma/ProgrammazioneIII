package teoria.i.sincThread.i.pipe.pipeTest;

import java.io.*;

class PipeTest {
   public static void main(String[] args) {
      PipedWriter out = new PipedWriter();
      PipedReader in = null;
      try {
         in = new PipedReader(out);
      } catch(IOException e) {System.out.println(e.getMessage());}
      new Sender(out).start();
      new Receiver(in).start();
   }
}