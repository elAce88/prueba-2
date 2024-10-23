/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.models;

/**
 *
 * @author Cetecom
 */
public class Documentales extends Striming{
    
    protected String nombre;
    protected String enfoqueEducativo;
    protected int duracion;

    public Documentales(String codigoUnico) {
        super(codigoUnico);
    }
    
    

    public Documentales(String nombre, String enfoqueEducativo, int duracion, String codigoUnico) {
        super(codigoUnico);
        this.nombre = nombre;
        this.enfoqueEducativo = enfoqueEducativo;
        this.duracion = duracion;
    }

    @Override
    public void Calcular_suscripcion(){
        System.out.println("Nombre documental: " + nombre + "enfoque educativo: " + enfoqueEducativo + "duracion: " + duracion);
    }
    
    @Override
    public double CostoSuscripcion(double costoBase) {
        if (duracion > 90) {
            costoBase -= costoBase * 0.05; 
        }
        return costoBase;
    }  
    
    
    
    
}

