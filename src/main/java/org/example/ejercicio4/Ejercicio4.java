package org.example.ejercicio4;

import org.example.Main;
import org.jboss.logging.Logger;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        org.jboss.logging.Logger logger = Logger.getLogger(Main.class);

        final float IVA = 1.21f;
        logger.info("Ingrese precio producto");
        Scanner sc = new Scanner(System.in);
        double precio = sc.nextDouble();

        precio = precio * IVA;
        logger.info("El precio total con IVA incluido es: " + precio);
    }
}
