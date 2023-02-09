package org.LAB.Esercizio1;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestReflection {
    public static void main(String[] args) throws ClassNotFoundException {
        /*
         reflection è la capacità di un programma di esaminare e/o modificare a runtime il proprio
         comportamento, e in particolare la struttura del proprio codice sorgente.
         */
        //un generico oggetto
        Object o = new Object();
        Class c = o.getClass();
        //oppure da una stringa
        Class bho = "AppuntiSoftware".getClass();

        // posso ottenere un riferimento all'oggetto Class di tipo Stringa in due modi
        String test = new String();
        Class c1 = test.getClass();
        //oppure
        Class c2 = Class.forName("java.lang.String");

        /*
        Per i tipi primitivi abbiamo un altra sintassi:
         */
        c = int.class;          // uguale a Integer.TYPE
        c = String.class;       // uguale a "AppuntiSoftware".getClass()
        c = byte[].class;       // un array di byte
        c = Class[][].class;    // una matrice di Class Object

        /*
        Ottenuto un oggetto di tipo Class possiamo iniziare ad utilizzare la Reflection API:
        possiamo ad esempio investigare su quali siano le superclassi di una data classe utilizzando
        il metodo getSuperClass(), nell’esempio seguente viene stampata
        a video tutta la gerarchia di classi della classe PrintStream:
         */
        System.out.println("stampo a video tutta la gerarchia di classi della classe PrintStream");
        Class cl = java.io.PrintStream.class;
        if (!cl.isPrimitive()) {
            for(Class s = cl; s != null; s = s.getSuperclass()) {
                if("java.lang.Object".equals(s.getName()))
                    System.out.println(s.getName());
                else
                    System.out.println(s.getName() + " estende");
            }
        }
        System.out.println("-".repeat(80));

        /*
        il metodo isPrimitive() serve per vedere se un oggetto è un valore primitivo, esistono ovviamente dei metodi
         di “test” per verificare se un oggetto è un array, una classe locale, ecc..:

         */
//        boolean isPrimitive()
//        boolean isArray()
//        boolean isLocalClass()
//        boolean isAnonymousClass()
//        boolean isMemberClass()
//        boolean isEnum()
//        boolean isAnnotation()
//        boolean isInterface()

        /*
        Se abbiamo un array di elementi possiamo conoscere il tipo degli elementi utilizzando getComponentType():
         */
        String array [] = new String[3];
        array[0] ="ciao";
        array[1]="mondo";
        array[2]="!";
        Class cla = array.getClass();
        if (cla.isArray())
            System.out.println(cla.getComponentType());

        /*
        Esistono anche dei metodi che permettono di sapere quali sono i campi, i costruttori, i metodi, ed eventuali
        classi e/o interfacce membri di una classe
         */

        /*
        cosa molto iportante e' possibile invocare metodi di una classe, vediamo un esempio con la classe String
         */

        try {
            String str = new String("Ciao da ");
            Class clazz = str.getClass();
            Method metodo= clazz.getMethod("concat", new Class[]{new String().getClass()});
            System.out.println ( metodo.invoke(str, new String("Fabio")) );
        } catch (SecurityException | NoSuchMethodException | IllegalArgumentException | IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }
}
