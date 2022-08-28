package org.example.ejercicio8;

import org.example.Main;
import org.jboss.logging.Logger;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        org.jboss.logging.Logger logger = Logger.getLogger(Main.class);
        Scanner sc = new Scanner(System.in);
        logger.info("Introduce un dia de la semana");
        String dia = sc.next();
        switch(dia){
            case "lunes":
            case "martes":
            case "miercoles":
            case "jueves":
            case "viernes":
                logger.info("Es un dia laboral");
                break;
            case "sabado":
            case "domingo":
                logger.info("No es un dia laboral");
            default:
                logger.info("La respuesta no es valida");
        }
    }
}
