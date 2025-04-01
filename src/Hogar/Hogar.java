/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hogar;

/**
 *
 * @author paqui
 */
public class Hogar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vivienda house1 = new Vivienda(120000);
        
        double precio;
        int numHabitaciones;
        double superficie;
        boolean parking;
        String estado;
        String propietario;
        
        printHome(house1);
    }

    public static void printHome(Vivienda house1) {
        System.out.println("Precio: " + house1.getPrecio());
        System.out.println("Número de habitaciones: "+ house1.getNumHabitaciones());
        System.out.println("Superficie en m2: " + house1.getSuperficie());
        System.out.println("¿Dispone de parking?: " + house1.isParking());
        System.out.println("Estado: "+ house1.getEstado());
        System.out.println("Propietario: "+ house1.getPropietario());
    }
    
}
