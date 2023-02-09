package teoria.d.input_output.f.testScannerConDelimitatori;

import java.io.*;
import java.util.Scanner;

public class TestScannerDelim {

    public static void main(String[] args) {

        Scanner scf = null;
        try {
            //String tmp = "true fish 2 fish red fish blue fish";
            //Scanner s = new Scanner(tmp).useDelimiter("\\s*fish\\s*");
            String tmp = "1 ; 2;red;blue;";
            Scanner s = new Scanner(tmp).useDelimiter("\\s*;\\s*");
            System.out.println(s.nextInt());
            System.out.println(s.nextInt());
            System.out.println(s.next());
            System.out.println(s.next());
            s.close();
        } catch (Exception e) {
            System.out.println("Eccezione: " + e.getClass() + " - " + e.getMessage());
            return;
        } finally {
            if (scf != null)
                scf.close();
        }
    }
}
