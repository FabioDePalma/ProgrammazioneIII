package org.LAB.Esercizio8Socket.resourses;

import java.io.Serializable;

public class Student implements Serializable {
    String name;
    String description;

    public Student(String name, String description){
        this.name = name;
        this.description = description;
    }

    public Student(String name){
        this.name = name;
        this.description = "";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Student{ " + "Name = " + name  + ", Description = " + description + '}';
    }
}
