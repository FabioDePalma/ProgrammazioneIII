package org.LAB.Esercizio4.es2;

import org.LAB.Esercizio4.es2.controller.Controller;
import org.LAB.Esercizio4.es2.model.Proverbi;
import org.LAB.Esercizio4.es2.view.FinestraProverbi;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainProverbi {
    public static void main(String[] args) {
        FinestraProverbi finestra = new FinestraProverbi();
        Proverbi model = new Proverbi(new ArrayList<>());
        Controller controller = new Controller(finestra, model);
//test commit
    }
}
