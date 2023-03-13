package org.LAB.Esercizio8Socket.multiClient.server;

import org.LAB.Esercizio8Socket.multiClient.resources.Student;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.List;

public class ServerThreadedHandlerStudent extends Thread{


    ObjectInputStream in = null;
    ObjectOutputStream out = null;
    Socket connection = null;
    int numberOfRequest;


    public ServerThreadedHandlerStudent(Socket socket, int numberOfRequest){
        this.connection = socket;
        this.numberOfRequest = numberOfRequest;
    }


    private void printStudents(List<Student> students) {
        for (Student elem : students){
            System.out.println(elem);
        }
    }



    public void workThread(){
        try{
            openInputOutput();
           // @SuppressWarnings("unchecked")
            List<Student> students = (List<Student>) in.readObject();

            System.out.println("Stampo la lista di studenti dal server, prima della modifica:");
            printStudents(students);
            /*
            Test per vedere funzionamento dei thread la prima richiesta ritorna al client la lista modificata con informatica
            la seconda richesta ritorna al client la lista modificata con medicina
             */
            if(numberOfRequest<1){
                //sleep(5000);
                for (Student elem : students){
                    elem.setDescription("Informatica");
                }
            }else {
                for (Student elem : students){
                    elem.setDescription("Medicina");
                }
            }



            System.out.println("Stampo la lista di studenti dal server con descrizione modificata:");
            printStudents(students);

            out.writeObject(students);
            out.flush();

        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally{
            closeStreams();
            closeConnection();
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
    @Override
    public void run() {
        workThread();
    }
}
