/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.models;

import java.util.ArrayList;

/**
 *
 * @author Cetecom
 */
import java.util.ArrayList;

public class Calcular {
    private ArrayList<String> streaming; 
    private ArrayList<Calcular> visto; 

    public Calcular() {
        streaming = new ArrayList<>();
        visto = new ArrayList<>();
    }

    public void agregarStreaming(String codigoUnico) {
        for (String s : streaming) {
            if (s.equals(codigoUnico)) {
                System.out.println("Error: el código único ya existe.");
                return;
            }
        }
        streaming.add(codigoUnico);
    }

    public void marcarComoVisto(Calcular cal) {
        visto.add(cal);
    }

    public int costoSuscripcion() {
        return visto.size();
    }

    public double calcularSuscripcion() {
        double costoTotal = 0;
        for (Calcular c : visto) {
            costoTotal += c.calcularSuscripcion(); 
        }
        return costoTotal;
    }
}

