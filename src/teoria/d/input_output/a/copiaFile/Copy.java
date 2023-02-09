package teoria.d.input_output.a.copiaFile;

import java.io.*;

public class Copy {
    public static void main(String[] args) {

        //FileReader legge da file (a caratteri)

        try {
            FileReader in = new FileReader("src/teoria/d/input_output/a/copiaFile/esempio.txt");
            //FileWriter out = new FileWriter("copia.txt"); // file protetto in scrittura
            FileWriter out = new FileWriter("src/teoria/d/input_output/a/copiaFile/copia1.txt");
            int c;
            while ((c = in.read()) != -1)   // -1 è l'EOF
                out.write(c); // NB: ogni volta il file perde il precedente contenuto e viene riscritto completamente
            in.close();
            out.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

