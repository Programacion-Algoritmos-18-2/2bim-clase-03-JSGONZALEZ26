/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paquete_estadio;

import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class OperacionData {

    ArrayList<Estadio> informacion;

    public void setInformacion(ArrayList<Estadio> info) {
        informacion = info;
    }

    public ArrayList<Estadio> getInformacion() {
        return informacion;

    }

    public double calcularPromedio() {
        double capacidad = 0;
        double acumulador = 0;
        for (int i = 0; i < getInformacion().size(); i++) {
            acumulador += getInformacion().get(i).getCapacidad();
        }
        capacidad = acumulador / getInformacion().size();
        return capacidad;
    }
}
