package org.example.ejercicio15;

import org.example.Main;
import org.jboss.logging.Logger;

import java.util.Scanner;

public class Ejercicio15 {

    public static void main(String[] args) {
        org.jboss.logging.Logger logger = Logger.getLogger(Main.class);

        boolean booleano = true;

        while (booleano) {
            Scanner in = new Scanner(System.in);

            logger.info("****** GESTION CINEMATOGRÁFICA ********");
            logger.info("1-NUEVO ACTOR");
            logger.info("2-BUSCAR ACTOR");
            logger.info("3-ELIMINAR ACTOR");
            logger.info("4-MODIFICAR ACTOR");
            logger.info("5-VER TODOS LOS ACTORES");
            logger.info("6-VER PELICULAS DE LOS ACTORES");
            logger.info("7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES");
            logger.info("8-SALIR");
            int operacion = in.nextInt();
            switch (operacion) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                System.out.println("Estas dentro");
                break ;
                case 8:
                    booleano = false;
                    break;
                default:
                    System.out.println("OPCION INCORRECTO");
            }
        }

    }
}

