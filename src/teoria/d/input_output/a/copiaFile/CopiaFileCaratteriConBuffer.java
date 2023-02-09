package teoria.d.input_output.a.copiaFile;

import java.io.*;

public class CopiaFileCaratteriConBuffer {
    public static void main(String[] args) throws IOException {
        /*
        FileReader prende carattere per carattere (Unicode) poooi
        li spara al BufferedReader che li accumula in un buffer
        */
        BufferedReader in = new BufferedReader(new FileReader("src/teoria/d/input_output/a/copiaFile/esempio.txt"));
        BufferedWriter out = new BufferedWriter(new FileWriter("src/teoria/d/input_output/a/copiaFile/copia2.txt"));
        int c;
        while ((c = in.read()) != -1)
            out.write(c);
        /*
        Quando usiamo i buffer bisogna svuolarli con la flush (prima di chiudere il file)
        se non viene fatta la flush (quando chiudiamo il file dovrebbe farla in automatico) ma
        ci sono situazioni (trasmissioni di dati in rete) se non viene fatta la flush non vengono spediti
        rimangono nel buffer
         */
        out.flush();
        in.close();
        out.close();
    }
}






