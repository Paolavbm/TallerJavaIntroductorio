package org.example.ejercicio7;

import org.example.Main;
import org.jboss.logging.Logger;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        org.jboss.logging.Logger logger = Logger.getLogger(Main.class);
        Scanner sc = new Scanner(System.in);
         Integer numero;

        do {
            logger.info("Por favor introduzca un numero mayor a 0");
            numero=sc.nextInt();
        }while (numero <= 0);

        logger.info(numero);
    }
}
