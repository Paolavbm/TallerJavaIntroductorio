package org.example.ejercicio5_6;

import org.example.Main;
import org.jboss.logging.Logger;

public class Ejercicio6 {
    public static void main(String[] args) {
        org.jboss.logging.Logger logger = Logger.getLogger(Main.class);
        for (int numero=1;numero<=100;numero++) {
            logger.info(numero);
        }
    }
}
