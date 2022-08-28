package org.example.ejercicio11;

import org.example.Main;
import org.jboss.logging.Logger;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        org.jboss.logging.Logger logger = Logger.getLogger(Main.class);
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");
        Integer contador = 0;
        Integer a = 0, e = 0, i = 0, o = 0, u = 0;
        logger.info("Introduzca una frase");
        String frase = sc.next();
        Integer longitud = frase.length();

        for (Integer p = 0; p < frase.length(); p++) {
            char fraseChar = frase.toLowerCase().charAt(p);

            switch (fraseChar) {
                case 'a':
                    a++;
                    break;
                case 'e':
                    e++;
                    break;
                case 'i':
                    i++;
                    break;
                case 'o':
                    o++;
                    break;
                case 'u':
                    u++;
                    break;
                default:
                    break;
            }
        }

        logger.info("La frase " + frase + " tiene una longitud de "+ longitud + " y tiene " + (a+e+i+o+u) + " vocales");
    }

}
