package org.example.ejercicio3;

import org.example.Main;
import org.jboss.logging.Logger;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        org.jboss.logging.Logger logger = Logger.getLogger(Main.class);
        Scanner sc = new Scanner(System.in);
        logger.info("Introduce el radio");
        double radio= sc.nextDouble();
        double area = Math.PI*Math.pow(radio, 2);

        logger.info("El radio area de un circulo es " + area + "m2");
    }
}
