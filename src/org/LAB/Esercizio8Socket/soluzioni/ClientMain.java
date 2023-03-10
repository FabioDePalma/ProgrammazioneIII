package org.LAB.Esercizio8Socket.soluzioni;

import java.util.ArrayList;
import java.util.List;

public class ClientMain {
    public static void main(String[] args) {
        runClients("127.0.0.1", 4445, 3);
    }

    /**
     * Istanzia e manda in esecuzione <i>nClients</i> Client che vengono
     * eseguiti ognuno su un thread dedicato.
     * @param host l'indirizzo IP sul quale il server è in ascolto.
     * @param port la porta sulla quale il server è in ascolto.
     * @param nClients il numero di client che saranno generati.
     */
    public static void runClients(String host, int port, int nClients) {
        List<Runnable> clients = new ArrayList<>();

        for (int i = 0; i < nClients; i++) {
            Client c = new Client(i);
            clients.add(() -> c.communicate(host, port));
        }

        for (Runnable client : clients) {
            Thread thread = new Thread(client);
            thread.start();
        }
    }
}
