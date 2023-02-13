# Esercizi GUI e Observer-Observable
## Esercizio 1
Sia data l'applicazione Exercise1, che è composta da:

- un **contatore** (Counter) che genera 50 numeri in ordine crescente e, per ogni multiplo m di 5, invoca un filtro passandogli m;
- un **filtro** (Filter) che, per ogni numero che riceve, aggiunge il numero a una lista di valori e, se la lista ha lunghezza pari, invoca un visualizzatore per visualizzarla su output;
- un **visualizzatore** (Visualizer) che visualizza su output la lista di numeri che riceve in input.

Si riscriva il codice dell'applicazione per organizzare la pipeline di lavoro utilizzando il pattern **Observer-Observable**.
```java
import java.util.*;

public class Exercise1 {

    public static void main(String[] args) {

        Visualizer v = new Visualizer();
        Filter f = new Filter(v);
        Counter c = new Counter(f);
        c.start();
    }
}

class Counter{

    private int c;
    private Filter filter;

    public Counter(Filter f) {
        c = 0;
        filter = f;
    }

    public void start() {

        for (int i=0; i<50; i++) {
            c++;
            if (c%5==0) {
                filter.filter(c);
            }
        }
    }
}

class Filter {

    private List<Integer> list;
    Visualizer visualizer;

    public Filter(Visualizer v) {
        visualizer = v;
        list = new ArrayList<Integer>();
    }

    public void filter(int c) {
        list.add(c);
        if (list.size()%2==0) {

            System.out.println("lista size: " + list.size());

            visualizer.visualize(list);
        }
    }
}

class Visualizer {

    public void visualize(List<Integer> list) {

        for (Integer i : list) {
            System.out.println(i.intValue());
        }
        System.out.println();
    }
}
```

## Esercizio 2
Sviluppare l'applicazione ProverbsApp utilizzando il **pattern MVC**. ProverbsApp offre un bottone per richiedere un proverbio estratto in modo random da una lista di proverbi.

Nello specifico:

- la **View** dell'applicazione include solo un **bottone** per richiedere un proverbio e una **label** per visualizzare il testo del proverbio (nella figura, "proverbio1");
- il **Model** dell'applicazione memorizza una lista di proverbi e, su richiesta, sceglie casualmente il proverbio da restituire;
- il **Controller** intercetta gli eventi della view: quando l'utente preme il bottone della view, il controller invoca il model per attivare l'identificazione (**internamente al model**) del nuovo proverbio attuale, da visualizzare.

**HELP**: quando il controller intercetta un evento della view, dovrebbe invocare un metodo del model che fa scegliere l'indice del prossimo proverbio da restituire. A quel punto il model cambia stato e attiva i suoi observers con setChanged() e notifyObservers(), facendo sì che la view si aggiorni in automatico per visualizzare il proverbio "attuale".
![immagine](es4.png)
