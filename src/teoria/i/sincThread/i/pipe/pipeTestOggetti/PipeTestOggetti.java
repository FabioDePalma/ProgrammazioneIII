package teoria.i.sincThread.i.pipe.pipeTestOggetti;

import java.io.*;
import java.util.*;

public class PipeTestOggetti {
    public static void main(String argv[]) throws Exception {
      PipedOutputStream pout = new PipedOutputStream();
      PipedInputStream pin = new PipedInputStream(pout);
      Sender s = new Sender(pout);
      Receiver r = new Receiver(pin);
      s.start();
      r.start();
    }
}