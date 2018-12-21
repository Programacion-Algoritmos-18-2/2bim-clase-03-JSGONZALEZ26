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
public class Principal {

    public static void main(String[] args) {
        LeerArchivoTexto1 mt = new LeerArchivoTexto1();
        OperacionData op = new OperacionData();
        mt.abrirArchivo();
        //mt.leerRegistros();        
        op.setInformacion(mt.leerRegistros());
        System.out.printf("El promedio es: %.2f\n", op.calcularPromedio());
        mt.cerrarArchivo();
    }
}
