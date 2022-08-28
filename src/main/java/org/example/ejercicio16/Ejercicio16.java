package org.example.ejercicio16;

import org.example.Main;
import org.jboss.logging.Logger;

import java.util.Scanner;

public class Ejercicio16 {

    public static void main(String[] args) {
        org.jboss.logging.Logger logger = Logger.getLogger(Main.class);
        Scanner sc = new Scanner(System.in);


        logger.info("Ingrese nombre");
        String nombre  = sc.next();
        logger.info("Ingrese edad");
        int edad = sc.nextInt();

        logger.info("Ingrese sexo H/M");
        char sexo = sc.next().charAt(0);

        logger.info("Ingrese peso");
        double peso = sc.nextInt();

        logger.info("Ingrese altura");
        double altura = sc.nextInt();


        Persona persona1 = new Persona(nombre, edad, sexo, peso, altura);

        Persona persona2 = new Persona(nombre, edad, sexo);

        Persona persona3 = new Persona();


        persona2.setAltura(1.68);
        persona2.setPeso(70.2);

        persona3.setNombre("Paola");
        persona3.setEdad(19);
        persona3.setSexo('F');
        persona3.setPeso(50);
        persona3.setAltura(166);

        logger.info("Persona 1");
        mensajePeso(persona1);
        mayorDeEdad(persona1);
        logger.info(persona1.toString());

        logger.info("Persona 2");
        mensajePeso(persona2);
        mayorDeEdad(persona2);
        logger.info(persona2.toString());

        logger.info("Persona 3");
        mensajePeso(persona3);
        mayorDeEdad(persona3);
        logger.info(persona3.toString());
    }

    public static void mensajePeso(Persona per) {
        org.jboss.logging.Logger logger = Logger.getLogger(Main.class);
        int IMC = per.IMC();

        switch (IMC) {

            case Persona.pesoAdecuado:

              logger.info("Tiene en un peso adecuado");

                break;

            case Persona.pesoBajo:

                logger.info("Tiene con un peso muy bajo");

                break;

            case Persona.pesoAlto:

                logger.info("Tiene un peso muy alto");

                break;

        }

    }

    public static void mayorDeEdad(Persona per) {
        org.jboss.logging.Logger logger = Logger.getLogger(Main.class);

        if (per.MayorDeEdad()) {

            logger.info("Es mayor de edad");

        } else {

            logger.info("Es menor de edad");


        }

    }


}
