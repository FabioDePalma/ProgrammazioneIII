package org.LAB.Esercizio8Socket.soluzioni;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ConnectException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Client {
	Socket socket = null;
	ObjectOutputStream outputStream = null;
	ObjectInputStream inputStream = null;
	int id;

	final int MAX_ATTEMPTS = 5;

	/**
	 * Costruisce un nuovo client.
	 * @param id identificatore numerico, utile solamente per la stampa dei messaggi.
	 */
	public Client(int id) {
		this.id = id;
	}

	/**
	 * Fa fino a 5 tentativi per comunicare con il server. Dopo ogni tentativo fallito
	 * aspetta 1 secondo.
	 * @param host l'indirizzo sul quale il server è in ascolto.
	 * @param port la porta su cui il server è in ascolto.
	 */
	public void communicate(String host, int port){
		int attempts = 0;

		boolean success = false;
		while(attempts < MAX_ATTEMPTS && !success) {
			attempts += 1;
			System.out.println("[Client "+ this.id +"] Tentativo nr. " + attempts);

			success = tryCommunication(host, port);

			if(success) {
				continue;
			}

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	// Tenta di comunicare con il server. Restituisce true se ha successo, false altrimenti
	private boolean tryCommunication(String host, int port) {
		try {
			connectToServer(host, port);
			List<Student> students = generateStudents(3);

			Thread.sleep(5000);

			sendStudents(students);
			receiveModifiedStudents();

			return true;
		} catch (ConnectException ce) {
			// nothing to be done
			return false;
		} catch (IOException | ClassNotFoundException se) {
			se.printStackTrace();
			return false;
		} catch (InterruptedException e) {
			e.printStackTrace();
			return false;
		} finally {
			closeConnections();
		}
	}

	private void closeConnections() {
		if (socket != null) {
			try {
				inputStream.close();
				outputStream.close();
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	private void sendStudents(List<Student> students) throws IOException, ClassNotFoundException {
		outputStream.writeObject(students);
		outputStream.flush();
	}

	private void receiveModifiedStudents() throws IOException, ClassNotFoundException {
		List<Student> modifiedStudents = (List<Student>) inputStream.readObject();
		System.out.println("[Client " + this.id + "] Ricevuti " + modifiedStudents.size() + " oggetti");

		if (modifiedStudents != null && modifiedStudents.size() > 0) {
			for (Student s : modifiedStudents) {
				System.out.println("[Client " + this.id + "] Oggetto ricevuto => " + s.toString());
			}
		}
	}

	private void connectToServer(String host, int port) throws IOException {
		socket = new Socket(host, port);
		outputStream = new ObjectOutputStream(socket.getOutputStream());

		// Dalla documentazione di ObjectOutputStream
		// callers may wish to flush the stream immediately to ensure that constructors for receiving
		// ObjectInputStreams will not block when reading the header.
		outputStream.flush();

		inputStream = new ObjectInputStream(socket.getInputStream());

		System.out.println("[Client "+ this.id + "] Connesso");
	}

	/**
	 * Genera una lista di Student popolata casualmente.
	 * @param n il numero di studenti.
	 * @return una lista contenente gli studenti.
	 */
	private List<Student> generateStudents(int n) {
		List<Student> students = new ArrayList<>();
		Random r = new Random(System.currentTimeMillis());

		String[] names = {"Mario Bianchi", "Marco Rossi", "Andrea Gialli", "Sara Verdi", "Giulia Neri"};
		String[] descriptions = {"Primo anno", "Secondo anno", "Terzo anno"};

		for (int i = 0; i < n; i++)
			students.add(new Student(i, names[r.nextInt(names.length)], descriptions[r.nextInt(descriptions.length)]));

		return students;
	}
}