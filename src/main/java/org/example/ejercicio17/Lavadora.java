package org.example.ejercicio17;

import java.awt.image.ColorConvertOp;

public class Lavadora extends Electrodomestico{
    private final static int cargaDef=5;

    private int carga;


    public int getCarga() {
        return carga;
    }

    public double precioFinal(){

        double adicional = super.precioFinal();

        if (carga>30){
            adicional+=50;
        }

        return adicional;
    }


    public Lavadora(){
        this(precioBaseDef, colorDef, consumoDef,pesoDef, cargaDef);
    }

    public Lavadora(double precioBase, double peso){
        this(precioBase, colorDef,  consumoDef, peso, cargaDef);
    }


    public Lavadora(double precioBase, String color, char consumo, double peso, int carga){
        super(precioBase, color, consumo, peso);
        this.carga=carga;
    }
}

