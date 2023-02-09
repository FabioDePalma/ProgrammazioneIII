package teoria.d.input_output.h.creazioneFile;

import java.io.*;


public class CreaEstendiFile {

    public static void main(String[] args) {
        String path = "src/teoria/d/input_output/h/creazioneFile/prova.txt";
        PrintWriter p = null;

        try {
            File file = new File(path);

            if (file.exists()) {
                System.out.println("Il file esiste già!");
                FileWriter fw = new FileWriter(file, true); // imposto uno scrittore che scrive al fondo del file
                p = new PrintWriter(new BufferedWriter(fw));
                p.println(" TESTO AGGIUNTO AL FONDO DEL FILE");
            } else {
                System.out.println("Il file non esiste");
                p = new PrintWriter(file);
                p.println(6667);
            }
        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println(e.getMessage());
        } finally {
            if (p != null) {
                p.flush();
                p.close();
            }
        }
    }
}

