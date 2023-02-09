package teoria.d.input_output.c.objectStream;

import java.io.Serializable;

class Impiegato implements Serializable {
    private String nome;

    public Impiegato(String nome) {
        this.nome = nome;
    }

    public String toString() {
        return nome;
    }
}
