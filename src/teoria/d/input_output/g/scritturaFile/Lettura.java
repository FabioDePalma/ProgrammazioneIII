package teoria.d.input_output.g.scritturaFile;

import java.util.*;

class Lettura {

    static final int MAX_TENTATIVI = 3;

    /**
     * Lettura robusta di un numero intero da tastiera.
     * String msg: messaggio da stampare prima dell'acquisizione dell'input da tastiera
     */
    public static int leggiIntero(String msg) {
        Scanner tastiera = new Scanner(System.in);
        int tentativo = 1;

        System.out.print(msg);
        while ((!tastiera.hasNextInt()) && (tentativo < MAX_TENTATIVI)) {
            tentativo++;
            tastiera.next();
            System.out.print("Immetti un intero, per favore (hai ancora " + (MAX_TENTATIVI - tentativo + 1) + " tentativi): ");
        }

        if (tentativo > MAX_TENTATIVI)
            throw new RuntimeException("Hai superato il numero di tentativi!");
        else
            return tastiera.nextInt();
    }


    /**
     * Lettura robusta di un numero con virgola da tastiera.
     * String msg: messaggio da stampare prima dell'acquisizione dell'input da tastiera
     */
    public static double leggiDouble(String msg) {

        Scanner tastiera = new Scanner(System.in);
        int tentativo = 1;
        System.out.print(msg);
        while ((!tastiera.hasNextDouble()) && (tentativo < MAX_TENTATIVI)) {
            tentativo++;
            tastiera.next();
            System.out.print("Immetti un con virgola, per favore (hai ancora " + (MAX_TENTATIVI - tentativo + 1) + " tentativi): ");
        }

        if (tentativo > MAX_TENTATIVI)
            throw new RuntimeException("Hai superato il numero di tentativi");
        else
            return tastiera.nextDouble();
    }


    /**
     * Lettura robusta di una stringa di interi delimitata dal carattere di fine riga, da tastiera.
     * String msg: messaggio da stampare prima dell'acquisizione dell'input da tastiera
     */
    public static String leggiStringa(String msg) {
        Scanner tastiera = new Scanner(System.in);
        System.out.print(msg);
        return tastiera.nextLine();
    }
}

