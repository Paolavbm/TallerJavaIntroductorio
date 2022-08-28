package org.example.ejercicio17;

public class Television  extends Electrodomestico{
    private final static int resolucionDef=20;


    private int resolucion;

    private boolean sintonizadorTDT;

    public double precioFinal(){

        double adicionar = super.precioFinal();


        if (resolucion>40){
            adicionar+=precioBase*0.3;
        }
        if (sintonizadorTDT){
            adicionar+=50;
        }

        return adicionar;
    }

    public Television(){
        this(precioBaseDef, colorDef, consumoDef , pesoDef, resolucionDef, false);
    }

    public Television(double precioBase, double peso){
        this(precioBase, colorDef, consumoDef, peso, resolucionDef, false);
    }

    public Television(double precioBase, String color, char consumo, double peso,  int resolucion, boolean sintonizadorTDT){
        super(precioBase, color, consumo, peso);
        this.resolucion=resolucion;
        this.sintonizadorTDT=sintonizadorTDT;
    }



}
