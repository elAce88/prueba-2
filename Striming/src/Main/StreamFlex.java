/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import cl.duoc.models.Documentales;
import cl.duoc.models.Pelicula;
import cl.duoc.models.Series;

/**
 *
 * @author Cetecom
 */
public class StreamFlex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Pelicula pelicula1 = new Pelicula("BLANCA NIEVES", "30 min", 3.5, "P001");
    Pelicula pelicula2 = new Pelicula("ROBOCOP", "90 min", 5.5, "P002");
    Pelicula pelicula3 = new Pelicula("MINIONS", "40 min", 2, "P003");
    Series serie1 = new Series("PRISON BREAK", 5, "no", "S001");
    Series serie2 = new Series("LUPITA", 1, "si", "S002");
    Documentales documental1 = new Documentales("ANIMAL PLANET", "ciencia", 40, "D001");
    Documentales documental2 = new Documentales("LOS LEONES", "ciencia", 60, "D002");
    
    Registro.agregarPelicula(pelicula1);
    Registro.agregarPelicula(pelicula2);
    Registro.agregarPelicula(pelicula3);
    Registro.agregarSeries(serie1);
    Registro.agregarSeries(serie2);
    Registro.agregarDocumental(documental1);

    
    Calcular.listarStreaming();

   
    System.out.println("Cantidad total de películas vistas: " + Calcular.visto());

    
    System.out.println("Costo total de suscripción: " + Calcular.calcularSuscripcion() + " pesos."); 
}

