# Esercizio Kernel-Modulo
Utilizzando lo schema kernel-modulo descritto a lezione, e i tipi generici, sviluppare una gerarchia di classi che permetta di gestire array ordinabili di elementi. Una ipotetica soluzione potrebbe includere (vd. schema UML sotto):

* Una classe SortableArray (il kernel), che contiene un modulo di tipo SortableList, e offre i metodi addModule() per aggiungere il modulo di tipo SortableList da usare; i metodi add, remove, print, sort per aggiungere/rimuovere/visualizzare a video/ordinare gli elementi contenuti nel modulo (il corpo di questi metodi invoca i rispettivi metodi del modulo). Definite la classe come generica, con tipo T vincolato a Comparable, per garantire che a runtime, in un oggetto di tipo SortableArray, non possano essere inseriti oggetti di tipo diverso da T.
* Una interface SortableList che specifica la struttura dati "lista-ordinabile"in modo astratto: la interface offre i metodi add, remove, sort, print. Poiché la lista deve essere ordinata, è bene che i metodi abbiano parametri di tipo Comparable (upper bound del tipo generico).
* Un'implementazione di SortableList, che memorizza una lista di elementi Comparable utilizzando, per esempio, utilizzando un ArrayList come struttura interna per la raccolta dei dati. La classe (es: SortableListImpl) offre i metodi di add, remove, print e sort per gestire elementi Comparable nell'ArrayList.

Sviluppare una semplice applicazione di test che crea un SortableArray di String, inserisce/rimuove degli elementi, ordina l'array e ne visualizza a video il contenuto. Analogamente per un SortableArray di Integer o di altri oggetti. Verificare i controlli di tipo tentando di inserire elementi eterogenei in uno stesso array ordinabile.

![immagine](immagine.png)