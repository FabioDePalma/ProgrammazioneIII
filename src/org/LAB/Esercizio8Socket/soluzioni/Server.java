package org.LAB.Esercizio8Socket.soluzioni;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.List;

public class Server {

	Socket socket = null;
	ObjectInputStream inStream = null;
	ObjectOutputStream outStream = null;

	/**
	 * Il server si mette in ascolto su una determinata porta e serve i client.
	 * I messaggi ricevuti dai client vengono stampati a video, modificati e inviati
	 * nuovamente al mittente.
	 *
	 * NB: Questa implementazione del server usa un solo thread, NON è un'implementazione
	 * scalabile, NON è sufficiente ai fini del progetto.
	 *
	 * @param port la porta su cui è in ascolto il server.
	 */
	public void listen(int port) {
		try {
			ServerSocket serverSocket = new ServerSocket(port);

			while (true) {
				serveClient(serverSocket);
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (socket!=null)
				try {
					socket.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
	}

	// Gestisce un singolo client
	private void serveClient(ServerSocket serverSocket) {
		try {
			openStreams(serverSocket);

			List<Student> students = (List<Student>) inStream.readObject();

			updateStudents(students);

			outStream.writeObject(students);
			outStream.flush();

		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			closeStreams();
		}
	}

	// Chiude gli stream utilizzati durante l'ultima connessione
	private void closeStreams() {
		try {
			if(inStream != null) {
					inStream.close();
			}

			if(outStream != null) {
				outStream.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// Aggiorna i dati studente passati in input
	private void updateStudents(List<Student> students) {
		if (students != null && students.size() > 0) {
			for (Student s : students) {
				System.out.println("Oggetto ricevuto => " + s.toString());
				s.setDescription(s.getDescription() + " PROMOSSO!");
			}
		}
	}

	// apre gli stream necessari alla connessione corrente
	private void openStreams(ServerSocket serverSocket) throws IOException {
		socket = serverSocket.accept();
		System.out.println("Server Connesso");

		inStream = new ObjectInputStream(socket.getInputStream());
		outStream = new ObjectOutputStream(socket.getOutputStream());
		outStream.flush();
	}

	public static void main(String[] args) {
		Server server = new Server();
		server.listen(4445);
	}
}