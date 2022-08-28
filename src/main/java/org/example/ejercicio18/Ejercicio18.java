package org.example.ejercicio18;

import org.example.Main;
import org.jboss.logging.Logger;

public class Ejercicio18 {
    public static void main(String[] args) {
        org.jboss.logging.Logger logger = Logger.getLogger(Main.class);
        Serie listaSeries[]=new Serie[5];
        Videojuego listaVideojuegos[]=new Videojuego[5];

        listaSeries[0]=new Serie();
        listaSeries[1]=new Serie("Stranger Things", "Matt Duffer");
        listaSeries[2]=new Serie("El verano en que me enamoré", 1, "Cine romántico", " Jenny Han");
        listaSeries[3]=new Serie("Resident Evil", 1, "Terror", "Andrew Dabb");
        listaSeries[4]=new Serie("Peaky Blinders", 6, "Crimen", " Steven Knight");

        listaVideojuegos[0]=new Videojuego();
        listaVideojuegos[1]=new Videojuego("FIFA 22", 24, "Deportes", "EA");
        listaVideojuegos[2]=new Videojuego("Minecraft", "Mojang Studios");
        listaVideojuegos[3]=new Videojuego("Mario Kart 8", 80, "Juegos de carreras de karts", "Nintendo");
        listaVideojuegos[4]=new Videojuego("Control", 250, "Aventura", "Remedy Entertainment");


        listaSeries[3].entregar();
        listaSeries[1].entregar();
        listaVideojuegos[3].entregar();
        listaVideojuegos[4].entregar();

        int entregados=0;

        for(int i=0;i<listaSeries.length;i++){
            if(listaSeries[i].isEntregado()){
                entregados+=1;
                listaSeries[i].devolver();

            }
            if(listaVideojuegos[i].isEntregado()){
                entregados+=1;
                listaVideojuegos[i].devolver();
            }
        }

        logger.info("Hay "+ entregados+" articulos entregados");



        Videojuego horasJuego = new Videojuego();
        horasJuego.setHorasEstimadas(0);
        for(Videojuego juego : listaVideojuegos){
            if(juego.compareTo(horasJuego) == 3) horasJuego = juego;


        }
        Serie horasSerie = new Serie();
        horasSerie.setnumeroTemporadas(0);
        for(Serie serie : listaSeries){
            if(serie.compareTo(horasSerie) == 3) horasSerie = serie;

        }


        logger.infov( "El juego con mas horas estimadas es: {0}", horasJuego.toString());
        logger.infov( "La serie con mas temporadas es: {0}", horasSerie.toString());

    }


}
