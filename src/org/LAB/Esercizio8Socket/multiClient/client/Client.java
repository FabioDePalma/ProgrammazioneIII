package org.LAB.Esercizio8Socket.multiClient.client;

import org.LAB.Esercizio8Socket.resourses.Student;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Thread.sleep;

public class Client {
    int id;
    ObjectInputStream in = null;
    ObjectOutputStream out = null;

    Socket soc;
    public Client(int id)  {
        this.id = id;

    }

    public static void main(String[] args) {
        Client c = new Client(0);
        c.connection("localhost", 8080);
        try{
            c.tryInputOutput();
        }finally {
            c.closeConnection();
        }


    }
    public void connection(String host, int port){

        try {
            System.out.println("apro il socio");
            soc = new Socket(host, port);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void closeConnection(){
        try{
            System.out.println("chiudo il socio");
            in.close();
            out.close();
            soc.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void tryInputOutput(){
        try {
            System.out.println("Inizio l'input e l'output");
            List<Student> students = generateStud();

            System.out.println("Studenti dal client, prima del invio: ");
            printStudents(students);
            out = new ObjectOutputStream(soc.getOutputStream());
            out.flush();
            out.writeObject(students);
            out.flush();
            in = new ObjectInputStream(soc.getInputStream());

            students = (List<Student>) in.readObject();

            System.out.println("Studenti dal client, dopo del invio: ");
            printStudents(students);

            //sleep(5000);

        } catch (IOException | ClassNotFoundException e) {
             e.printStackTrace();
        }
    }
    public List<Student> generateStud(){
        List<Student> students = new ArrayList<>();
        students.add(new Student("Fabio"));
        students.add(new Student("Diana", "info"));
        students.add(new Student("Maria Sole", "Medicina"));
        students.add(new Student("Marta", "Medicina"));
        students.add(new Student("Giacomo", "Magistra"));
        students.add(new Student("Filippo", "Legge"));
        students.add(new Student("Michele", "Agente"));
        students.add(new Student("Daniela", "Divano"));
        students.add(new Student("Tommaso", "Marta" ));
        students.add(new Student("Alena", "Giacomo"));
        students.add(new Student("Lucia", "Madre"));
        students.add(new Student("Anna", "*******"));
        students.add(new Student("Teresa", "Miracoli"));
        students.add(new Student("Giulio", "Girelle"));
        return students;
    }
    private static void printStudents(List<Student> students) {
        for (Student elem : students){
            System.out.println(elem);
        }
    }
}
