package org.example.ejercicio18;

public class Videojuego implements Entregable{

    private final static Integer horasDef = 10;

    private String titulo;

    private Integer horasEstimadas;

    private boolean entregado;

    private String genero;

    private String compañia;


    public Videojuego() {

        this.titulo = "";
        this.horasEstimadas = horasDef;
        this.genero = "";
        this.compañia = "";
    }


    public Videojuego(String titulo, String compañia) {
        this.titulo = titulo;
        this.horasEstimadas = horasDef;
        this.genero = "";
        this.compañia = compañia;
    }


    public Videojuego(String titulo, Integer horasEstimadas, String genero, String compañia) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.entregado = false;
        this.genero = genero;
        this.compañia = compañia;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getHorasEstimadas() {
        return horasEstimadas;
    }

    public void setHorasEstimadas(Integer horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getcompañia() {
        return compañia;
    }

    public void setcompañia(String compañia) {
        this.compañia = compañia;
    }

    @Override
    public void entregar() {
        entregado=true;
    }

    @Override
    public void devolver() {
        entregado=false;
    }

    @Override
    public boolean isEntregado() {
        if(entregado){
            return true;
        }
        return false;
    }
    @Override
    public int compareTo(Object a) {
        Videojuego juego = (Videojuego) a;
        int compare = 1;
        if (this.horasEstimadas == juego.getHorasEstimadas()) {
            compare = 2;
        } else if (this.horasEstimadas > juego.getHorasEstimadas()) {
            compare = 3;
        }

        return compare;

    }



    @Override
    public String toString(){
        return "Informacion del videojuego: \n" +
                "\tTitulo: "+titulo+"\n" +
                "\tHoras estimadas: "+horasEstimadas+"\n" +
                "\tGenero: "+genero+"\n" +
                "\tcompañia: "+compañia;
    }

}
