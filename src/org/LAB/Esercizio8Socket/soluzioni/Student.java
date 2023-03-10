package org.LAB.Esercizio8Socket.soluzioni;

import java.io.Serializable;

public class Student implements Serializable {

private static final long serialVersionUID = 5950169519310163575L;
private int id;
private String name;
private String description;


public Student(int id, String name, String scrittura) {
	this.id = id;
	this.name = name;
	this.description = scrittura;
}

public int getId() {
	return id;
}

public String getName() {
	return name;
}

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}

public boolean equals(Object o) {
	if (this == o)
		return true;
	if (o == null || getClass() != o.getClass())
		return false;

	Student student = (Student) o;

	if (id != student.id)
		return false;

	if (name != null ? !name.equals(student.name) : student.name != null)
		return false;

	return true;
}

public int hashCode() {
	return id;
}

public String toString() {
	return "Id = " + getId() + " ; Name = " + getName() + " ; Description = " + getDescription();
}
}