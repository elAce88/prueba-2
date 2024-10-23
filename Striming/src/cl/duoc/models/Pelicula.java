/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.models;


/**
 *
 * @author Cetecom
 */
public class Pelicula extends Striming{
    
    protected String nombre;
    protected String Duracion;
    protected double Calificacion;

    public Pelicula(String codigoUnico) {
        super(codigoUnico);
    }

    public Pelicula(String nombre, String Duracion, double Calificacion, String codigoUnico) {
        super(codigoUnico);
        this.nombre = nombre;
        this.Duracion = Duracion;
        this.Calificacion = Calificacion;
    }

    

    @Override
    public String toString() {
        return "Pelicula{" + "nombre=" + nombre + ", Duracion=" + Duracion + ", Calificacion=" + Calificacion + '}';
    }
   
    @Override
    public void calcular_suscripcion(double Calcular_suscripcion){
            double costoBase = Calcular_suscripcion;
            if (Calificacion > 4.5){
                costoBase += costoBase * 0.10;
            }
        return costoBase;
    }   
}
