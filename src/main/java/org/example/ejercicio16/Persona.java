package org.example.ejercicio16;

public class Persona {

    private final static char sexoD = 'H';
    public static final int pesoAdecuado = 0;
    public static final int pesoBajo = -1;
    public static final int pesoAlto = 1;

    private String nombre;
    private int edad;
    private String DNI;
    private char sexo;
    private double peso;;
    private double altura;



    public Persona() {

        this("", 0, sexoD, 0, 0);

    }

    public Persona(String nombre, int edad, char sexo) {

        this(nombre, edad, sexo, 0, 0);

    }
    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }


    private void comprobarSexo() {


        if (sexo != 'H' && sexo != 'M') {

            this.sexo = sexoD;

        }

    }

    public void setNombre(String nombre) {

        this.nombre = nombre;

    }

    public void setEdad(int edad) {

        this.edad = edad;

    }

    public void setSexo(char sexo) {

        this.sexo = sexo;

    }

    public void setPeso(double peso) {

        this.peso = peso;

    }

    public void setAltura(double altura) {

        this.altura = altura;

    }


    public int IMC() {

        double pesoP = peso / (Math.pow(altura, 2));

        if (pesoP >= 18.5 && pesoP <= 25) {

            return pesoAdecuado;

        } else if (pesoP < 18.5) {
            return pesoBajo;

        } else {
            return pesoAlto;

        }

    }

    public boolean MayorDeEdad() {

        boolean mayorEdad = false;

        if (edad >= 18) {

            mayorEdad = true;

        }

        return mayorEdad;

    }
    public String toString() {

        String sexo;

        if (this.sexo == 'H') {
            sexo = "Hombre";
        } else {
            sexo = "Mujer";
        }

        return "Informacion de la persona"

        + "Nombre " + nombre + "; " + " sexo:  " + sexo  + ", edad " + edad + " DNI:  " + DNI  + " peso:  " + peso  + " altura:  " + altura  +".";



    }
}
