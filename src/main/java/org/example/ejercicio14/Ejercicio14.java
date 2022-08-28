package org.example.ejercicio14;

import org.example.Main;
import org.jboss.logging.Logger;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {


        org.jboss.logging.Logger logger = Logger.getLogger(Main.class);
        Scanner sc = new Scanner(System.in);

        logger.info("Ingrese numero 1");
        long number = sc.nextInt();
        for(long i=number; i<=1000; i++)
        {
            if((i%2)!=0)
            {logger.info(i);
            }
        }
    }
}
