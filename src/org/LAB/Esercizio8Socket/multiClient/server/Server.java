package org.LAB.Esercizio8Socket.multiClient.server;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    ObjectInputStream in = null;
    ObjectOutputStream out = null;
    Socket connection = null;
    ServerSocket s = null;


    public static void main(String[] args) {
        int i = 0;
        try {
            ServerSocket serverSocket = new ServerSocket(8080);
            while(true){
                Socket socket = serverSocket.accept();
                System.out.println("E' arrivata una richiesta da parte di" + socket.getInetAddress() );
                Thread t = new ServerThreadedHandlerStudent(socket, i);
                i++;
                t.start();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

/*
    ObjectInputStream in = null;
    ObjectOutputStream out = null;
    Socket connection = null;
    ServerSocket s = null;
    int id;

    public Server(int id) {
        this.id = id;
    }
    public static void main(String[] args) {
        Server server = new Server(0);
        server.workServer();
    }

    private void printStudents(List<Student> students) {
        for (Student elem : students){
            System.out.println(elem);
        }
    }
    private void closeStreams() {
        try {
            if(in != null) {
                in.close();
            }
            if(out != null) {
                out.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void closeConnection(){
        try {
            connection.close();
            s.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void openInputOutput(){
        try {
            in = new ObjectInputStream(connection.getInputStream());
            out = new ObjectOutputStream(connection.getOutputStream());
            out.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void waitConnection(){
        try {
            s = new ServerSocket(8080);
            while(true){
                connection = s.accept();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void workServer(){
        try{
            waitConnection();
            openInputOutput();
            @SuppressWarnings("unchecked")
            List<Student> students = (List<Student>) in.readObject();

            System.out.println("Stampo la lista di studenti dal server, prima della modifica:");
            printStudents(students);

            for (Student elem : students){
                elem.setDescription("Informatica");
            }

            System.out.println("Stampo la lista di studenti dal server con descrizione modificata:");
            printStudents(students);

            out.writeObject(students);
            out.flush();

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally{
            closeStreams();
            closeConnection();
        }
    }*/
}
