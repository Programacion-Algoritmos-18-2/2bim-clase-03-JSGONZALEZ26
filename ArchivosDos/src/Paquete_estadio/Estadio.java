/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paquete_estadio;

/**
 *
 * @author Jairo
 */
public class Estadio {

    public String nombre;
    public int capacidad;
    public String tipodeDeporte;

    public Estadio(String nombre, int capacidad, String tipodeDeporte) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.tipodeDeporte = tipodeDeporte;
    }

    public Estadio() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getTipodeDeporte() {
        return tipodeDeporte;
    }

    public void setTipodeDeporte(String tipodeDeporte) {
        this.tipodeDeporte = tipodeDeporte;
    }


    @Override
    public String toString() {
        return "";
    }

}
