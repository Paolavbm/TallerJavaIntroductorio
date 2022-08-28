package org.example.ejercicio10;

import org.example.Main;
import org.jboss.logging.Logger;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {

        org.jboss.logging.Logger logger = Logger.getLogger(Main.class);
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");

        logger.info("Ingrese frase");
        String frase = sc.next();
        logger.info(frase.replace(" ",""));
    }
}
