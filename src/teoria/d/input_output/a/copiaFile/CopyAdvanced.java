package teoria.d.input_output.a.copiaFile;

import java.io.*;
import java.util.*;

public class CopyAdvanced {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean riprova = false;
        FileReader in = null;
        do {
            System.out.println("Inserisci il nome del file da cui leggere, con estensione:");
            String fileName = sc.next();
            riprova = false;
            try {
                in = new FileReader(fileName);
            } catch (IOException e) {
                System.out.println(e.getMessage());
                riprova = true;
            }
        } while (riprova);

        try {
            FileWriter out = new FileWriter("src/teoria/d/input_output/a/copiaFile/copia1.txt");
            int c;
            while ((c = in.read()) != -1)
                out.write(c);
            out.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                in.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}





