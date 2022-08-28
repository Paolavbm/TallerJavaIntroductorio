package org.example.ejercicio1_2;

import org.example.Main;
import org.jboss.logging.Logger;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        org.jboss.logging.Logger logger = Logger.getLogger(Main.class);

        Scanner sc = new Scanner(System.in);

        logger.info("Ingrese numero 1");
        long number1 = sc.nextInt();
        logger.info("Ingrese numero 2");
        long number2 = sc.nextInt();
        if (number1>= number2){

            if(number1 == number2){
              logger.info(number1 + " y " + number2 + " son iguales");
            }else{
                logger.info(number1 + " es mayor a " + number2);
            }
        }else{
            logger.info(number2 + " es mayor a " + number1);
        }

    }

}
