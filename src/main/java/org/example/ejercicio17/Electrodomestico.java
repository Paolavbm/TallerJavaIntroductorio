package org.example.ejercicio17;

public class Electrodomestico {


    protected final static char consumoDef='F';

    protected final static double precioBaseDef =100;

    protected final static double pesoDef=5;
    protected final static String colorDef="blanco";

    protected double precioBase;
    protected String color;
    protected char consumo;
    protected double peso;


    private void colorComprobar (String color){

        String coloresOption[]={"blanco", "negro", "rojo", "azul", "gris"};

        boolean disponible =  false;

        for(int i=0;i<coloresOption.length && disponible;i++){

            if(coloresOption[i] == color){
                disponible=true;
            }
        }
        if(disponible
        ){
            this.color=color;
        }else{
            this.color= colorDef ;
        }

    }

    Electrodomestico() {
        this.color = colorDef;
        this.consumo = consumoDef;
        this.peso = pesoDef;
        this.precioBase= precioBaseDef;
    }

    Electrodomestico(double precio, double peso) {
        this.color = colorDef;
        this.consumo = consumoDef;
        this.peso = peso;
        this.precioBase = precio;
    }

    public Electrodomestico(double precioBase, String color, char consumo, double peso) {
        this.precioBase = precioBase;
        colorComprobar(color);
        this.consumo = consumo;
        this.peso = peso;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumo() {
        return consumo;
    }

    public void setConsumo(char consumo) {
        this.consumo = consumo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    private double determinarPrecio() {
        double calcularPrecio = 0;

        this.comprobarConsumoEnergetico(this.consumo);

        if(this.peso >= 0 && this.peso <= 19) {
            calcularPrecio = 19;
        } else if(this.peso >= 20 && this.peso <= 49) {
            calcularPrecio = 50;
        } else if(this.peso >= 50 && this.peso <= 79) {
            calcularPrecio = 80;
        }	else {
            calcularPrecio = precioBaseDef;
        }


        this.precioBase += calcularPrecio;

        return this.precioBase;
    }


    public void comprobarConsumoEnergetico(char letra) {
        boolean exist = false;

        switch(letra) {
            case 'A':
                exist = true;
                this.precioBase = 100.00;
                break;
            case 'B':
                exist = true;
                this.precioBase = 80.00;
                break;
            case 'C':
                exist = true;
                this.precioBase = 60.00;
                break;
            case 'D':
                exist= true;
                this.precioBase = 50.00;
                break;
            case 'E':
                exist = true;
                this.precioBase = 30.00;
                break;
            case 'F':
                exist = true;
                this.precioBase = 10.00;
                break;
        }

        if(exist) {
            this.consumo = letra;
        }
    }
    public double precioFinal() {
        return determinarPrecio();
    }

}
