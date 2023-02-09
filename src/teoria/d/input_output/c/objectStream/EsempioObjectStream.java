package teoria.d.input_output.c.objectStream;

import java.io.*;

public class EsempioObjectStream {

    public static void main(String[] args) {
	   /*
	   Con ObjectOutputStream e ObjectInputStream è possibile leggere o scrivere qualunque OGGETTO
	   purchè la sua classe implementi l'interfaccia SERIALIZABLE
	   Normalmente si passano oggetti attraverso json
	   ma se abbiamo un programma che è composta da moduli, quindi non stiamo facendo parlare due applicazioni
	   completamente sconnesse l'una dall'altra, quindi se siamo all'interno della stessa applicazione e
	   dobbiamo trasmettere oggetti conviene trasmettere gli oggetti direttamente assumendo che chi li riceve
	   sappia esattamente qual'è la classe per poterla ricostruire
	    */

        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("src/teoria/d/input_output/c/objectStream/impiegati.dat"));
            Impiegato rossi = new Impiegato("Rossi");
            out.writeObject(rossi);
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("src/teoria/d/input_output/c/objectStream/impiegati.dat"));
            Impiegato imp = (Impiegato) in.readObject();
            System.out.println("Impiegato: " + imp);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

}



