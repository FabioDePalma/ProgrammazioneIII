package teoria.d.input_output.g.scritturaFile;



import java.io.*;


// questo file chiede a utente di digitare 5 numeri e li
// scrive su un file di nome numeri2.txt
// ad ogni esecuzione riscrive il file
public class ScritturaFile {

    public static void main(String[] args) {
        PrintWriter p = null;
        try {
            p = new PrintWriter(new File("src/teoria/d/input_output/g/scritturaFile/numeri.txt"));
            for (int i = 0; i < 5; i++) {
                int num = Lettura.leggiIntero("digita numero: "); // Mx 3 tentativi di inserimento numero
                p.println(num);
                p.flush();
            }
        } catch (IOException | RuntimeException e) {
            System.out.println(e.getMessage());
        }
        // NB: metto la chiusura del PrintWriter nella finally per essere certa che
        //  se ci sono problemi venga comunque chiuso il file (che conterrà
        //  quanto inserito fino a prima dell'eccezione).
        finally {
            if (p != null) //NB: se fallisce la new il PrintWriter è null!!
                p.close();
        }
    }
}

