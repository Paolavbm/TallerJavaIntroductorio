package org.example.ejercicio18;

public class Serie implements Entregable{


    private final static Integer temporadasDef=3;

    private String titulo;

    private Integer numeroTemporadas;

    private boolean entregado;

    private String genero;

    private String creador;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getnumeroTemporadas() {
        return numeroTemporadas;
    }

    public void setnumeroTemporadas(Integer numeroTemporadas) {
        this.numeroTemporadas = numeroTemporadas;
    }

    public String getGenero() {
        return genero;
    }

    public String getcreador() {
        return creador;
    }

    public void setcreador(String creador) {
        this.creador = creador;
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
        Serie serie = (Serie) a;
        int compare = 1;
        if (this.numeroTemporadas == serie.getnumeroTemporadas()) {
            compare = 2;
        } else if (this.numeroTemporadas> serie.getnumeroTemporadas()) {
            compare = 3;
        }

        return compare;
    }


    public Serie(){
        this("",temporadasDef, "", "");
    }

    public Serie(String titulo, String creador){
        this(titulo, temporadasDef, "", creador);
    }

    public Serie(String titulo, Integer numeroTemporadas, String genero, String creador) {
        this.titulo = titulo;
        this.numeroTemporadas = numeroTemporadas;
        this.genero = genero;
        this.creador = creador;
        this.entregado = false;
    }

    @Override
    public String toString(){
        return "Informacion de la Serie: \n" +
                "\tTitulo: "+titulo+"\n" +
                "\tNumero de temporadas: "+numeroTemporadas+"\n" +
                "\tGenero: "+genero+"\n" +
                "\tCreador: "+creador;
    }

}
