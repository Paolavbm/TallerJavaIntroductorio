package org.example.ejercicio5_6;
import org.example.Main;
import org.jboss.logging.Logger;

public class Ejercicio5 {
    public static void main(String[] args) {
        org.jboss.logging.Logger logger = Logger.getLogger(Main.class);
        Integer numero = 1;
        while (numero<=100) {
            logger.info(numero);
            numero++;
        }
    }
}
