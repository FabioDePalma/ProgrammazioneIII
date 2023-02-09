package teoria.d.input_output.b.dataInputOutputStream;

import java.io.*;

public class EsempioDataStream {

    public static void main(String[] args) {
	   /*
	   DataInputStream o DataOutputStream sono classi che vanno a vedere le sequenze e le interpretano
	   in base alla loro codifica, quindi ci sono dei metodi per leggere e scrivere dati primitivi
	   vedi dout.writeInt,Double,Char...
		*/

        try {
            DataOutputStream dout = new DataOutputStream(new FileOutputStream("src/teoria/d/input_output/b/dataInputOutputStream/prova.dat"));
            dout.writeInt(250);
            dout.writeDouble(3.14);
            dout.writeChar('a');
            dout.close();
            DataInputStream din = new DataInputStream(new FileInputStream("src/teoria/d/input_output/b/dataInputOutputStream/prova.dat"));
            System.out.println(din.readInt());
            System.out.println(din.readDouble());
            System.out.println(din.readChar());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}

