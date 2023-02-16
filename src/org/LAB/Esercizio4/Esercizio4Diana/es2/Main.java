package org.LAB.Esercizio4.Esercizio4Diana.es2;


import org.LAB.Esercizio4.Esercizio4Diana.es2.controller.Controller;
import org.LAB.Esercizio4.Esercizio4Diana.es2.model.Model;
import org.LAB.Esercizio4.Esercizio4Diana.es2.view.View;

public class Main {
    public static void main(String[] args) {
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);
        //controller.run();
    }
}
