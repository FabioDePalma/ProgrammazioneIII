package teoria.d.input_output.d.classeFile;

import java.io.*;

public class ListaDir {
    public static void main(String[] args) throws IOException {
        //predisposizione del canale di output
        PrintStream out = System.out;
        File f = null;
        //se non ci sono argomenti consideriamo la directory corrente
        if (args.length == 0)
            f = new File("src/teoria/d/input_output/d/classeFile/.");
        else
            f = new File(args[0]);

        //se il nome specificato e'...
        if (f.isFile())
            //...quello di un file allora ne stampa nome e dimensione
            out.println("File: " + f.getAbsolutePath() + ", " + f.length() + " byte");
        else {  //...quello di una dir allora...
            out.println("Directory: " + f.getAbsolutePath());
            String[] lista = f.list();     //...preleva la lista dei file...
            //...stampa i dati di ognuno
            for (int i = 0; i < lista.length; i++) {
                File tmp = new File(f.getAbsolutePath(), lista[i]);
                if (tmp.isFile())
                    out.println(" file: " + tmp.getName() + " " + tmp.length() + " byte");
                else
                    out.println(" dir.: " + tmp.getName());
            }
        }
    }
}
