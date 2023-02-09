package teoria.d.input_output.h.creazioneFile;

import java.io.*;


// questo file chiede a utente di digitare 5 numeri e li
// scrive su un file di nome numeri2.txt
// ad ogni esecuzione riscrive il file
public class CreaFile {

    public static void main(String[] args) {
        PrintWriter p = null;
        String path = "src/teoria/d/input_output/h/creazioneFile/prova.txt";

        try {
            File file = new File(path);

            if (file.exists())
                System.out.println("Il file " + path + " esiste");
            else {
                p = new PrintWriter(new File(path));
                p.println(666);
                p.flush();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            if (p != null) // NB: Se il file esiste già, il PrintWriter è null
                p.close();
        }
    }
}

