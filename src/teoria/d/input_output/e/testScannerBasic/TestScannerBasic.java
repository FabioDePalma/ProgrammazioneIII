package teoria.d.input_output.e.testScannerBasic;

import java.io.*;
import java.util.Scanner;

public class TestScannerBasic {

    public static void main(String[] args) {

        Scanner scf = null;
        try {
            scf = new Scanner(new File("src/teoria/d/input_output/e/testScannerBasic/nomiEcognomi.txt"));
            while (scf.hasNext()) {
                String name = scf.next();
                String surname = scf.next();
                String phone = scf.next();
                System.out.println("Nome: " + name + "; Cognome: " + surname + "; Tel: " + phone);
            }
        } catch (IOException e) {
            System.out.println("PROBLEMA: " + e.getMessage());
            return;
        } finally {
            if (scf != null) //NB: se fallisce la new File lo scanner è null
                scf.close();
        }
    }
}
