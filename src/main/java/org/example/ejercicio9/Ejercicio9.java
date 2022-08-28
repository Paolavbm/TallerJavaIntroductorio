package org.example.ejercicio9;

import org.example.Main;
import org.jboss.logging.Logger;

import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {
        org.jboss.logging.Logger logger = Logger.getLogger(Main.class);
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");
        String frase1 ="La sonrisa sera la mejor arma contra la tristeza";
        logger.info("Introduzca una frase de su preferencia");
        String frase2 = sc.next();

        logger.info(frase1.replace('a', 'e') + " " + frase2);
    }
}
