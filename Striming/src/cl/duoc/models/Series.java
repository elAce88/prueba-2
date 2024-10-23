/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.models;




/**
 *
 * @author Cetecom
 */
public class Series extends Striming {
    
    protected String nombre;
    protected int numeroTemporada;
    protected String finalizada;

    public Series(String codigoUnico) {
        super(codigoUnico);
    }

    public Series(String nombre, int numeroTemporada, String finalizada, String codigoUnico) {
        super(codigoUnico);
        this.nombre = nombre;
        this.numeroTemporada = numeroTemporada;
        this.finalizada = finalizada;
    }

    @Override
    public void CalcularSuscripcion() {
        System.out.println("Nombre serie: " + nombre + ", Número de temporadas: " + numeroTemporada + ", Finalizada: " + finalizada);
    }

    @Override
    public double CostoSuscripcion(double costoBase) {
        if (finalizada.equals("no") & numeroTemporada > 3) {
            costoBase += costoBase * 0.10; 
        }
        return costoBase;
    }
}
