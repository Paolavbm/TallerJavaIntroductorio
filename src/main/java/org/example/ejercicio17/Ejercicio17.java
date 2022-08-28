package org.example.ejercicio17;

import org.example.Main;
import org.jboss.logging.Logger;

public class Ejercicio17 {
    public static void main(String[] args) {
        Electrodomestico lista[]=new Electrodomestico[10];
        org.jboss.logging.Logger logger = Logger.getLogger(Main.class);
        //Asignamos cada una de las posiciones como queramos
        lista[0]=new Lavadora(500,  "verde", 'c', 23, 1 );
        lista[1]=new Electrodomestico(200, "gis", 'C', 23);
        lista[2]=new Television(500, "negro", 'E', 44, 42, false);
        lista[3]=new Television(300, 90);
        lista[4]=new Electrodomestico(200, 23);
        lista[5]=new Television(200, "naranja", 'C', 44 , 30, true);
        lista[5]=new Lavadora(300,"blanco", 'Z', 40 ,  40);
        lista[6]=new Lavadora(150, 30);
        lista[7]=new Television(150, 30);
        lista[8]=new Electrodomestico(200, "verde", 'C', 34);
        lista[9]=new Electrodomestico(200, 34);
        double sumaElectrodomesticos=0;
        double sumaTelevisiones=0;
        double sumaLavadoras=0;


        for(int i=0;i<lista.length;i++){


            if(lista[i] instanceof Electrodomestico){
                sumaElectrodomesticos+=lista[i].precioFinal();
            }
            if(lista[i] instanceof Lavadora){
                sumaLavadoras+=lista[i].precioFinal();
            }
            if(lista[i] instanceof Television){
                sumaTelevisiones+=lista[i].precioFinal();
            }
        }


        logger.info("La suma del precio de los electrodomesticos es de "+ sumaElectrodomesticos);
        logger.info("La suma del precio de las lavadoras es de "+ sumaLavadoras);
        logger.info("La suma del precio de las televisiones es de "+ sumaTelevisiones);

    }
}
