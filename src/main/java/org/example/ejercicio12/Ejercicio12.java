package org.example.ejercicio12;

import org.example.Main;
import org.jboss.logging.Logger;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        org.jboss.logging.Logger logger = Logger.getLogger(Main.class);
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");

        logger.info("Ingrese frase 1");
        String frase1 = sc.next();
        logger.info("Ingrese frase 2");
        String frase2 = sc.next();

        if(frase1.equals(frase2)){
            System.out.println("Las frases son iguales");
        }else{
            System.out.println("Las frases no son iguales");
        }
    }
}
