package teoria.d.input_output.d.classeFile;

import java.io.*;
import java.util.Date;

public class TestFile {

    public static void main(String[] args) throws IOException {
        PrintStream out = System.out;

        //le costanti
        out.println("Separatore utilizzato dal sistema operativo = " + File.separator);

        File file = new File("src/teoria/d/input_output/d/classeFile/numeri.txt");
        // informazioni sul file
        out.println("             nome = " + file.getName());
        out.println("pathname assoluto = " + file.getAbsolutePath());
        out.println("  directory padre = " + (new File(file.getAbsolutePath()).getParent()));
        out.println("          esiste? = " + file.exists());
        out.println("     e' leggibile? = " + file.canRead());
        out.println("    e' scrivibile? = " + file.canWrite());
        out.println("       e' un file? = " + file.isFile());
        out.println(" e' una directory? = " + file.isDirectory());
        out.println("  ultima modifica = " + (new Date(file.lastModified())).toString());
        out.println("       dimensione = " + file.length() + " byte");
    }
}
